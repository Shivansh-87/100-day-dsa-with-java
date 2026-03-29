package Day_18;
import java.io.*;
import java.net.*;

public class ServerSide {
    public static void main(String[] args) {
        try(ServerSocket server=new ServerSocket(1234);
            Socket socket=server.accept();
            DataInputStream in=new DataInputStream(socket.getInputStream())){
                System.out.println("Server started. Waiting for client...");

                String message;
                while(!(message=in.readUTF()).equals("End")){
                    System.out.println("Received from client: " + message);
                }
            }catch(IOException e){
                e.printStackTrace();
            }
    }
}
