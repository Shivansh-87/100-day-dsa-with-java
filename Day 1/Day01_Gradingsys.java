import java.util.Scanner;
public class Day01_Gradingsys {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter: ");
        int i =sc.nextInt();
        if(i>50 && i<60){
            System.out.println("D");
        }
        else if(i>60 && i<70){
            System.out.println("c");
        }
        else if(i>70 && i<80){
            System.out.println("B");
        }
        else if(i>80 && i<=100){
            System.out.println("A");
        }
        else{
            System.out.println("invalid");
        }
        sc.close();
            
        
    }
}
