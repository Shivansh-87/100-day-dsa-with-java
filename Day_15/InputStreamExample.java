package Day_15;
import java.io.FileInputStream;
public class InputStreamExample {
    public static void main(String[] args) throws Exception{
        FileInputStream ntr=new FileInputStream("a.txt");
        int i;
        while((i=ntr.read())!=-1){
            System.out.print((char) i);
        }
        ntr.close();


    }
}
