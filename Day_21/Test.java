package Day_21;

import java.util.*;  
import java.io.*;  
public class Test {  
public static void main(String[] args)throws Exception{  
    FileReader reader=new FileReader("C:\\Users\\shiva\\OneDrive\\Desktop\\dsa with java\\Day_21\\db.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
      
    System.out.println(p.getProperty("user"));  
    System.out.println(p.getProperty("password"));  
}  
}  
