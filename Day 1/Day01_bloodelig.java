import java.util.Scanner;
public class Day01_bloodelig {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter age:");
    int age=sc.nextInt();
    System.out.print("enter weight:");
    int weight=sc.nextInt();
    if(age>18){
        if(weight>60){
            System.out.println("eligible");
        
        }
        else{
            System.out.println("not eligible");
        }
    }
}
}