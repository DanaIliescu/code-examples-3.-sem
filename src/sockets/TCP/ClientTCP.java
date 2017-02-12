package sockets.TCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by Dana on 23-Dec-16.
 */
public class ClientTCP {
    public static void main(String[] args) {
        InetAddress host = null;
        Scanner inUser = new Scanner(System.in);
        String sentence;

        try {
            host = InetAddress.getLocalHost();
            int port = 7777;
            Socket client = new Socket(host, port);

            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            DataInputStream in = new DataInputStream(client.getInputStream());

            sentence = inUser.nextLine();

            out.writeUTF(sentence);
            System.out.println(in.readUTF());

            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
