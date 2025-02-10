import java.io.*;
import java.net.*;

public class UdpServerExample {
    public static void main(String[] args) {
        int port = 9876;

        try (DatagramSocket socket = new DatagramSocket(port)) {
            System.out.println("Server started. Listening on port " + port + "...");

            while (true) {
                byte[] receiveBuffer = new byte[1024];

                // DatagramPacket to receive data from client
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                socket.receive(receivePacket); // Wait for incoming packet

                // Process data received from client
                String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received from client: " + clientMessage);

                // Example: Sending response back to client
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                String serverResponse = "Hello from server";
                byte[] sendBuffer = serverResponse.getBytes();

                // DatagramPacket to send response to client
                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort);
                socket.send(sendPacket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


