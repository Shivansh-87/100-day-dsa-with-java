package Day_9;
class sumex{
    public static int sum(int n){
        if(n==0){
            return 0;
        }else{
            return n+sum(n-1);
        }
    }
}
public class recursivesum {
    public static void main(String[] args) {
        int num=5;
        int result=sumex.sum(num);
        System.out.println("The sum of first "+num+" natural numbers is: "+result);
    }
}
