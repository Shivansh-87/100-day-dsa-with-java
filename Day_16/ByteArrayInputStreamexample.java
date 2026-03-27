package Day_16;
import java.io.*;

public class ByteArrayInputStreamexample {
    public static void main(String[] args) throws Exception{
        byte[] buf={3,2,4,5};
        ByteArrayInputStream byt=new ByteArrayInputStream(buf);
        int k=0;
        while((k=byt.read())!= -1){
            char ch=(char)k;
            System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);
        }
    }
}
