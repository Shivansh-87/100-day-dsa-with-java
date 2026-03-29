package Day_18;
import java.io.*;
import java.net.*;

public class ClientSide {
    public static void main(String[] args) {
        try(Socket socket=new Socket("localhost", 1234);
            DataOutputStream out=new DataOutputStream(socket.getOutputStream());
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))){
                System.out.println("Connected to server. Type messages to send (type 'End' to stop):");

                String message;
                while(!(message=reader.readLine()).equals("End")){
                    out.writeUTF(message);
                }
            }catch(IOException e){
                e.printStackTrace();
            }
    }
}
