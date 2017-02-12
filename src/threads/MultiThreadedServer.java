package threads;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by Dana on 22-Dec-16.
 */
public class MultiThreadedServer {
    private static ServerSocket serverSocket;
    private static final int PORT = 7777;
    public static ArrayList<Socket> clientSockets;
    private static DataInputStream input;

    public static void main(String[] args) throws IOException {
        try {
            serverSocket = new ServerSocket(PORT);
            clientSockets = new ArrayList<>();

        } catch (IOException ioEx) {
            System.out.println("\nUnable to set up port!");
            System.exit(1);
        }
        System.out.println("ServerTCP waiting for Clients on port " + PORT + ".");

        Thread[] activeThreads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(activeThreads);
        for (int i = 0; i < Thread.currentThread().getThreadGroup().activeCount(); i++){
            System.out.println("Thread nr.: " + i + " with name: " + activeThreads[i].getName());
        }

        //wait for client
        while(true) {
            Socket client = serverSocket.accept();
            System.out.println(client.toString() + "connected");

            Thread handleClient = new Thread(() -> {
                try{
                    while (true){
                        input = new DataInputStream(client.getInputStream());
                        System.out.println(input.readUTF());
                        //create a thread to handle communication with his client and pass a reference to the relevant socket
                    }
                }catch (Exception e){
                    System.out.println("Connection reset");
                }
            });
            handleClient.start();
            activeThreads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
            Thread.currentThread().getThreadGroup().enumerate(activeThreads);
            for (int i = 0; i < Thread.currentThread().getThreadGroup().activeCount(); i++){
                if (!activeThreads[i].isDaemon())
                System.out.println("Thread nr.: " + i + " with name: " + activeThreads[i].getName());
            }
        }
    }

}
