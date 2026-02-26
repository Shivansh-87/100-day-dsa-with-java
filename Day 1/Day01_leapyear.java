import java.util.Scanner;
public class Day01_leapyear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter year");
        int i=sc.nextInt();
        if (((i%4==0) && (i%100!=0)) || (i%400==0)){
            System.out.println("leap year");
        }else{
            System.out.println("normal yr");
        }
        sc.close();


    }
    
}
