package sockets.TCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Dana on 23-Dec-16.
 */
public class ServerTCP {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(7777);
            String message;
            String capitalizedMessage;

            while (true){
                Socket clientSocket = serverSocket.accept();
                DataInputStream input = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream output = new DataOutputStream(clientSocket.getOutputStream());

                message = input.readUTF();
                capitalizedMessage = message.toUpperCase() + "\n";

                output.writeUTF(capitalizedMessage);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
