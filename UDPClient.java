import java.io.*;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket clientSocket = new DatagramSocket(); // Create a UDP socket

            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;

            // Send a message to the server
            String message = "Hello, server!";
            byte[] sendData = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
            clientSocket.send(sendPacket);

            byte[] receiveData = new byte[1024];

            // Receive response from the server
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Server response: " + response);

            // Close socket
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
