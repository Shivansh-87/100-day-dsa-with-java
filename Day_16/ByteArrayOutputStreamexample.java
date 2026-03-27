package Day_16;
import java.io.*;
public class ByteArrayOutputStreamexample {
    public static void main(String[] args) throws Exception{
        FileOutputStream fo1=new FileOutputStream("y.txt");
        FileOutputStream fo2=new FileOutputStream("z.txt");

        ByteArrayOutputStream bout=new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fo1);
        bout.writeTo(fo2);

        bout.flush();
        bout.close();
        System.out.println("Success");
    }
}
