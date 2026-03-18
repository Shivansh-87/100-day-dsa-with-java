package Day_7;
import java.util.Scanner;
public class userdefined {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols=sc.nextInt();
        int array[][]=new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array you entered is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(array[i][j] +" ");

            }
                System.out.println();
        }
        sc.close();
    }
}
