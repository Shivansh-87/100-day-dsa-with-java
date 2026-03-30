package Day_19;
import java.util.*;
public class ArrayListexample {
    public static void main(String[] args) {
        LinkedList<String> al=new LinkedList<String>();
        //Vector<String> v=new Vector<String>();
        // ArrayList<String> list=new ArrayList<String>();
        al.add("lucy");
        al.add("pussy");
        al.add("mussy");
        Iterator<String> itr=al.iterator();  //Iterator = pointer/cursor that moves through elements
        while(itr.hasNext()){                   //
            System.out.println(itr.next());
        }
    }
}
// This is the loop condition

// ✅ hasNext()
// Returns true → if next element exists
// Returns false → if no more elements