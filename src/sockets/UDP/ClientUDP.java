package sockets.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * Created by Dana on 23-Dec-16.
 */
public class ClientUDP {
    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        try {
            InetAddress ip = InetAddress.getLocalHost();
            int port = 7777;
            DatagramSocket client = new DatagramSocket();

            byte[] sendData;
            byte[] receiveData = new byte[1024];

            String message = inUser.nextLine();
            sendData = message.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ip, port);
            client.send(sendPacket);

            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            client.receive(receivePacket);

            String fromServer = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("From server: " + fromServer);

            client.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
