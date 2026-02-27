package Day_2;
import java.util.Scanner;
public class Day02_array {
    public static void main(String[] args){
        // int[] arr={1,2,3,4,5};
        // for(int i:arr){
        //     System.out.println(i);
        // }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];

        System.out.println("Enter the elements of array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The elements of array are:");
        for(int i:arr){
            System.out.println(i);
        }
        sc.close();

    }
}
