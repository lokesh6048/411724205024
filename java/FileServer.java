import java.io.*;
import java.net.*;

public class FileServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(6000);
        System.out.println("Server started... Waiting for client");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected");

        DataInputStream dis = new DataInputStream(socket.getInputStream());

        String fileName = dis.readUTF();
        FileOutputStream fos = new FileOutputStream("received_" + fileName);

        byte[] buffer = new byte[4006];
        int bytesRead;

        while ((bytesRead = dis.read(buffer)) > 0) {
            fos.write(buffer, 0, bytesRead);
        }

        System.out.println("File received successfully");

        fos.close();
        dis.close();
        socket.close();
        serverSocket.close();
    }
}