package Day_19;

import java.net.*;
public class URLDemo{
    public static void main(String[] args) {
        try{
            URL url=new URL("https://www.tpoint.com/java-tutorial");
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPort());  
            System.out.println(url.getFile());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}