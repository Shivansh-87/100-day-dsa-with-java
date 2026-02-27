package Day_2;
import java.util.ArrayList;
public class Day02_list {
    public static void main(String[] args){

        ArrayList<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("world");
        list.add("java");
        for(String i:list){
            System.out.println(i);
        }
    }

}
