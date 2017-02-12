package threads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Dana on 22-Dec-16.
 */
public class Client {
    private static Socket client;
    private static DataOutputStream output;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            InetAddress host = InetAddress.getLocalHost();
            int port = 7777;
            client = new Socket(host, port);
            System.out.println("Connected.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unable to connect.");
        }

        Thread sendMessage = new Thread(() -> {
            try {
                output = new DataOutputStream(client.getOutputStream());
                while(true){
                    System.out.println("Enter message: ");
                    output.writeUTF(in.nextLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        sendMessage.start();
    }
}
