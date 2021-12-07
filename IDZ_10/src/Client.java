import java.net.*;
import java.io.*;
import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) throws IOException{
        Socket clientSocket = new Socket("192.168.0.102", 8000);

        OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        clientSocket.getInputStream()
                )
        );

        writer.write("Get me some info\n");
        writer.flush();
        String response = reader.readLine();
        System.out.println(reader.readLine());

        reader.close();
        writer.close();
        clientSocket.close();
    }
}
