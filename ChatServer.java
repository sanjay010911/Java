import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server waiting for client on port 5000...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Connected to client: " + clientSocket.getInetAddress().getHostAddress());

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

            String clientMessage;
            String serverMessage;

            while (true) {
                // Read message from the client
                clientMessage = in.readLine();
                System.out.println("Client: " + clientMessage);

                // If the client sends "bye", exit the loop and close the connection
                if (clientMessage.equalsIgnoreCase("bye")) {
                    break;
                }

                // Read message from the server console and send it to the client
                System.out.print("Server: ");
                serverMessage = consoleInput.readLine();
                out.println(serverMessage);
            }

            // Close resources
            in.close();
            out.close();
            consoleInput.close();
            clientSocket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
