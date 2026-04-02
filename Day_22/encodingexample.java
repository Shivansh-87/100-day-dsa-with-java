package Day_22;
import java.util.Base64;
public class encodingexample {
    public static void main(String[] args) {
        String original="Hello boi";
        String encoded= Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encoded);

    }
}
