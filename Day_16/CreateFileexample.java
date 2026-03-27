package Day_16;
import java.io.File;
import java.io.IOException;

public class CreateFileexample {
    public static void main(String[] args) {
        try{
            File f0=new File("t.txt");
            if(f0.createNewFile()){
                System.out.println("File"+f0.getName() + "is created sucksexfully");
            }else{
                System.out.println("File is already exist.");
            }
        }catch(IOException exception){
            System.out.println("unexpected error occur");
            exception.printStackTrace();
        }
    }
    
}
