import java.util.Arrays;
import java.util.List;

public class evenarray {
    public static void main(String[] args){
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for(int number:numbers){   //for(datatype variable : collection)
            if(number%2==0){
                System.out.println(number);
            }
        }
    }
}
