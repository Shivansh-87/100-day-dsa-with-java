package Day_19;
// Getting URLConnection Object
// In the following example, we use the openConnection() method of the URL class to obtain a URLConnection object.

import java.net.*;
public class URLConnectionExample {
    public static void main(String[] args) {
        try{
            URL url=new URL("http://www.javatpoint.com/java-tutorial");
            URLConnection urlcon=url.openConnection();
            System.out.println("successfully got the URLConnection object");
        }catch(Exception e){
            System.out.println(e);
        }   
    }
}
