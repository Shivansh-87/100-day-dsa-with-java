package Day_2;

//"factorial is an accumulator variable initialized to 1 because factorial is a multiplicative operation. It stores the intermediate product during each iteration and finally holds the computed factorial value."

import java.util.Scanner;
public class Day02_factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number: ");
        int number=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial *=i;
        }
        System.out.println("Factorial of "+number+" is: "+factorial);
        sc.close();

    }
    
}
