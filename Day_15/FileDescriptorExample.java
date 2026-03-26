package Day_15;
// import java.io.File;
// import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileDescriptorExample {
    public static void main(String[] args) {
        String filePath="examples.txt";
        try(FileOutputStream out=new FileOutputStream(filePath)){
            out.write("Hello,world!".getBytes());
        }catch(IOException e){
            System.out.println("error writing to file: " + e.getMessage());
            return;
        }
        try(FileInputStream fis = new FileInputStream(filePath);
        FileInputStream fisFromFD=new FileInputStream(fis.getFD())){
            int data;
            while((data=fisFromFD.read()) !=-1){
                System.out.print((char)data);
            }
        }catch(IOException e){
            System.out.println("Error reading from file:" + e.getMessage());
        }

    }
}
