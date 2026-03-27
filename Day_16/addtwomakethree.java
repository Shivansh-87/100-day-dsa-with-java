package Day_16;
// Reading from Two Files and Writing into Another File
//This example demonstrates how to read data from two files and write the combined data into another file.
import java.io.*;
public class addtwomakethree {
    public static void main(String[] args) throws Exception {
        FileInputStream f1=new FileInputStream("one.txt");
        FileInputStream f2=new FileInputStream("two.txt");
        FileOutputStream fout=new FileOutputStream("three.txt");
        SequenceInputStream sis=new SequenceInputStream(f1,f2);
        int i;
        while((i=sis.read())!=-1){
            fout.write(i);
        }
        sis.close();
        fout.close();
        f1.close();
        f2.close();
    }
}
