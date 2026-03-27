package Day_16;

import java.io.*;
public class DataInputStreamexample {
    public static void main(String[] args) throws IOException{
        InputStream input=new FileInputStream("testout.txt");
        DataInputStream inst=new DataInputStream(input);
        int count=input.available();
        byte[] arr=new byte[count];
        inst.read(arr);
        for(byte bt:arr){
            char k=(char)bt;
            System.out.println(k+"-");
        }
    }
}
