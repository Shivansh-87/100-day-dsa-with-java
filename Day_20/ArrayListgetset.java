package Day_20;
//This example explains how to access and modify elements in an ArrayList using the get() and set() methods.
import java.util.*;
public class ArrayListgetset {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        
        System.out.println(("Element :"+list.get(1)));

        list.set(1,"D");

        for(String element:list){
            System.out.println(element);
        }
    }
}
