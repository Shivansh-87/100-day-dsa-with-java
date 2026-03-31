package Day_20;

import java.util.HashMap;
import java.util.Map;

public class HashMapexample {
    public static void main(String[] args) {
        Map<Integer, String> map=new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        System.out.println("value for A:"+map.get(1));
        System.out.println("value for B:"+map.get(2));
        System.out.println("value for C:"+map.get(3));

        for(Map.Entry<Integer, String> entry:map.entrySet()){
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+" "+value);
        }
        map.remove(2);
        System.out.println("after removing key 2:");
        if(map.containsKey(2)){
            System.out.println("value for key 2:"+map.get(2));
        } else {
            System.out.println("key 2 not found in the map");
        }

    }
}
