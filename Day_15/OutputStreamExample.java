package Day_15;
import java.io.FileOutputStream;
public class OutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout=new FileOutputStream("a.txt");
        String content="student exam answer";
        fout.write(content.getBytes());
        fout.close();
        System.out.println("Data written sucsexfully");
    }
}
