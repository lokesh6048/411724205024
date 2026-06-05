import java.io.*;
import java.net.*;

public class FileClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 6000);

        File file = new File("test.txt");
        FileInputStream fis = new FileInputStream(file);

        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        dos.writeUTF(file.getName());

        byte[] buffer = new byte[4006];
        int bytesRead;

        while ((bytesRead = fis.read(buffer)) > 0) {
            dos.write(buffer, 0, bytesRead);
        }

        System.out.println("File sent successfully");

        fis.close();
        dos.close();
        socket.close();
    }
}