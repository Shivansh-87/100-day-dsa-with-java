package Day_9;
class finite{
    static int count=0;
    static void p(){
        count ++;
        if(count<=5){
            System.out.println("Hello "+count);
            p();
        }
    }
}
public class recursionfinite {
    public static void main(String[] args) {
        finite.p();
    }
}
