package Day_20;
//This example demonstrates how to serialize and deserialize an ArrayList.
import java.io.*;
import java.util.*;

public class ArrayListSerializationandde {
    public static void main(String[] args) {
        
       try{
         ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file"));
        oos.writeObject("file");
        oos.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("file"));
        @SuppressWarnings("unchecked")
        ArrayList<String> data=(ArrayList<String>) ois.readObject();
        System.out.println(data);
        ois.close();
       }catch(Exception e){
        System.out.println(e);
       }
    }
}

// FileOutputStream("file") → file create/open karta hai
// ObjectOutputStream → object ko file me likhta hai
// writeObject(list) → poori ArrayList ko file me store karta hai
