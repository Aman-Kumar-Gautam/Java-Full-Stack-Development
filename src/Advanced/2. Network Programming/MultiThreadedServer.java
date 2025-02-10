import java.io.*;
import java.net.*;

public class MultiThreadedServer {
    public static void main(String[] args) {
        int port = 8080;
        int clientCounter = 0;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started. Listening on port " + port + "...");

            while (true) {
                // Wait for client connection
                Socket clientSocket = serverSocket.accept();
                clientCounter++;
                System.out.println("Client connected (" + clientCounter + "): " + clientSocket.getInetAddress());

                // Create a new thread to handle client communication
                ClientHandler clientHandler = new ClientHandler(clientSocket, clientCounter);
                Thread handlerThread = new Thread(clientHandler);
                handlerThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Runnable class to handle client communication
class ClientHandler implements Runnable {
    private Socket clientSocket;
    private int clientNumber;

    public ClientHandler(Socket socket, int clientNumber) {
        this.clientSocket = socket;
        this.clientNumber = clientNumber;
    }

    @Override
    public void run() {
        try {
            // Input and output streams for client communication
            InputStream in = clientSocket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            OutputStream out = clientSocket.getOutputStream();
            PrintWriter writer = new PrintWriter(out, true);

            // Communicate with client
            String clientMessage;
            while ((clientMessage = reader.readLine()) != null) {
                System.out.println("Client " + clientNumber + " says: " + clientMessage);
                writer.println("Server received: " + clientMessage);
            }

            // Close resources
            reader.close();
            writer.close();
            clientSocket.close();
            System.out.println("Client " + clientNumber + " disconnected.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}