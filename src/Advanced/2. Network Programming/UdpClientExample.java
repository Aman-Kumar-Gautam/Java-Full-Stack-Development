import java.io.*;
import java.net.*;

public class UdpClientExample {
    public static void main(String[] args) {
        String serverName = "localhost";
        int serverPort = 9876;

        try (DatagramSocket socket = new DatagramSocket()) {
            InetAddress serverAddress = InetAddress.getByName(serverName);

            // Example: Sending data to server
            String message = "Hello from client";
            byte[] sendBuffer = message.getBytes();

            // DatagramPacket to send data to server
            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, serverAddress, serverPort);
            socket.send(sendPacket);

            // DatagramPacket to receive response from server
            byte[] receiveBuffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            socket.receive(receivePacket); // Wait for server response

            // Process response from server
            String serverResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Server says: " + serverResponse);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}