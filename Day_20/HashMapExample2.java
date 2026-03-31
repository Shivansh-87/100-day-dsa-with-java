package Day_20;
import java.util.*;
public class HashMapExample2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"mango");
        map.put(2,"apple");
        map.put(3,"grapes");
        map.put(4,"banana");
        System.out.println("Iterating Hasmap:");

        for(Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

        }
    }
}
