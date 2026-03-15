package Day_4;

class calculation1 {
    static int cube(int x){
        return x*x*x;

    }
}
public class calculation{
    public static void main(String[] args) {
        int result=calculation1.cube(5);
        System.out.println(result);
    }
}