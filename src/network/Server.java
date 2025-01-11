package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            System.out.println("Server started on port 8888");
            while (true) {
                try (Socket socket = serverSocket.accept();
                     BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                     PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
                    
                    System.out.println("Client connected");
                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {
                        if ("stop".equalsIgnoreCase(inputLine)) {
                            System.out.println("Stopping server as per client request");
                            out.println("Server stopping...");
                            return;
                        }
                        System.out.println("Received from client: " + inputLine);
                        out.println("Processed: " + inputLine);
                    }
                } catch (IOException e) {
                    System.out.println("Exception handling client connection\n" + e);
                }
            }
        } catch (IOException e) {
            System.out.println("Exception starting server\n" + e);
        }
    }
}