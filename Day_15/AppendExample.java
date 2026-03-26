package Day_15;
import java.io.FileOutputStream;
public class AppendExample {
    public static void main(String[] args){
        try{
            FileOutputStream fond=new FileOutputStream("a.txt");
            String s="\n Append new data";
            fond.write(s.getBytes());
            fond.close();
            System.out.println("data appended sucksexfully");

        }catch(Exception e){
            System.out.println(e);
        }
        
        

        
    }
}
