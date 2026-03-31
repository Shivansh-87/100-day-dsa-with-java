package Day_20;
import java.util.*;
public class Arraylistsorting {
    public static void main(String[] args) {
        ArrayList<String> as=new ArrayList<>();
        as.add("banana");
        as.add("zab");
        as.add("jat");
        Collections.sort(as);

        for(String words:as){
            System.out.println(words);
        }

        ArrayList<Integer> bs=new ArrayList<>();
        bs.add(1);
        bs.add(15);
        bs.add(14);
        bs.add(19);

        Collections.sort(bs);
        for(Integer no:bs){
            System.out.println(no);
        }

    }
}
