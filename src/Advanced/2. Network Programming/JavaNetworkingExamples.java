import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

public class JavaNetworkingExamples {
    public static void main(String[] args) {
        new Thread(JavaNetworkingExamples::startServer).start();
        new Thread(JavaNetworkingExamples::startClient).start();
        new Thread(JavaNetworkingExamples::httpClientExample).start();
    }

    public static void startServer() {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server started on port 8080");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                try (InputStream in = clientSocket.getInputStream();
                     OutputStream out = clientSocket.getOutputStream()) {
                    byte[] buffer = new byte[1024];
                    int bytesRead = in.read(buffer);
                    String receivedMessage = new String(buffer, 0, bytesRead);
                    System.out.println("Received from client: " + receivedMessage);
                    out.write("Hello from Server".getBytes());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void startClient() {
        try (Socket socket = new Socket(InetAddress.getByName("localhost"), 8080);
             InputStream in = socket.getInputStream();
             OutputStream out = socket.getOutputStream()) {
            out.write("Hello from Client".getBytes());
            byte[] buffer = new byte[1024];
            int bytesRead = in.read(buffer);
            String response = new String(buffer, 0, bytesRead);
            System.out.println("Server Response: " + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void httpClientExample() {
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        try {
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();
            System.out.println("HTTP Status Code: " + responseCode);

            try (InputStream in = con.getInputStream()) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                StringBuilder response = new StringBuilder();
                while ((bytesRead = in.read(buffer)) != -1) {
                    response.append(new String(buffer, 0, bytesRead));
                }
                System.out.println("Response Body:\n" + response.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
