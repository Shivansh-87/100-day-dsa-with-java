package Day_22;
import java.util.Base64;
public class decodingexample {
    public static void main(String[] args) {
        String encoded="SGVsbG8gSmF2YQ==";
        byte[] decodedBytes=Base64.getDecoder().decode(encoded);
        String decoded=new String(decodedBytes);            
        System.out.println("Decoded String: "+decoded);
    }
}
