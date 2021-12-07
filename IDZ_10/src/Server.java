import java.net.*;
import java.io.*;



public class Server {
    public static void main(String[] args) throws IOException{
        int count = 0;
        ServerSocket serverSocket = new ServerSocket(8000);
        while(true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("client accepted " + (count ++));
            OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            clientSocket.getInputStream()
                    )
            );
            String request = reader.readLine();
            String response = "Your message lenght is " + request.length() +"\n";
            writer.write(response);
            writer.flush();
            writer.close();


            clientSocket.close();
        }
    }
}
