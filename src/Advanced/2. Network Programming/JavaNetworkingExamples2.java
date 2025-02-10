import java.io.*;
import java.net.*;

public class JavaNetworkingExamples2 {
    public static void main(String[] args) {
        new Thread(JavaNetworkingExamples::startServer).start();
        new Thread(JavaNetworkingExamples::startClient).start();
        new Thread(JavaNetworkingExamples::httpClientExample).start();
    }

    public static void startServer() {
        int port = 8080;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on port " + port);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                new Thread(() -> handleClient(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleClient(Socket clientSocket) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {
            
            String clientMessage = reader.readLine();
            System.out.println("Received from client: " + clientMessage);
            writer.println("Hello from Server");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void startClient() {
        String serverName = "localhost";
        int port = 8080;
        try (Socket socket = new Socket(serverName, port);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            
            writer.println("Hello from Client");
            String response = reader.readLine();
            System.out.println("Server Response: " + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void httpClientExample() {
        String urlString = "https://jsonplaceholder.typicode.com/posts/1";
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            int responseCode = conn.getResponseCode();
            System.out.println("HTTP Status Code: " + responseCode);

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line).append("\n");
                }
                System.out.println("Response Body:\n" + response.toString());
            }
            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
