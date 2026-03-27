package Day_16;
import java.io.*;
public class BufferedOutputStreamConstructorExample1 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("sexa.txt");
            BufferedOutputStream bout=new BufferedOutputStream(fout);
            String s="Hello im here";
            bout.write(s.getBytes());

            bout.flush();
            bout.close();
            fout.close();

            System.out.println("Data written sucksexfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
