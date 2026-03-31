package Day_20;
import java.util.*;
public class HashTableexample {
    public static void main(String[] args) {
        Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
        hm.put(100,"A");
        hm.put(101,"B");
        hm.put(102,"C");
        hm.put(103,"D");
        
        for(Map.Entry<Integer,String> m:hm.entrySet()){
            System.out.println(m.getKey()+ " " +m.getValue());
        }
        
    }
}
