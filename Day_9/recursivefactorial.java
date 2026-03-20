package Day_9;
class factorialrecursive{
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

}
public class recursivefactorial {
    public static void main(String[] args) {
        int num=5;
        int result=factorialrecursive.factorial(num);
        System.out.println("The factorial of "+num+" is: "+result);
    }
    
}
