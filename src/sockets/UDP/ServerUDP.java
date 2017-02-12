package sockets.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Dana on 23-Dec-16.
 */

public class ServerUDP {
    public static void main(String args[]) throws Exception {
        DatagramSocket serverSocket = new DatagramSocket(7777);

        byte[] receiveData = new byte[1024];
        byte[] sendData;

        while(true)
        {
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();

            String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
            String capitalizedMessage = message.toUpperCase();
            sendData = capitalizedMessage.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            serverSocket.send(sendPacket);
        }
    }
}