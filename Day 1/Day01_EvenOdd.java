// Checking EVEN or ODD
import java.util.Scanner;
public class Day01_EvenOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int i=sc.nextInt();
        if(i%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        sc.close();
    }
}