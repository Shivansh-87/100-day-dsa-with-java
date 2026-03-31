package Day_20;
//The following example demonstrates how to convert an array into a List by traversing each element.
import java.util.*;
public class arraytolist {
    public static void main(String[] args) {
        String[] arr={"jva","buby","shubi","lby"};
        System.out.println("Printing array:"+Arrays.toString(arr));

        List<String> l=new ArrayList<String>();
            for(String list:arr){
                l.add(list);


            }
            System.out.println(l);
            
        
    }
}

