package Day_7;

import java.util.Scanner;

public class userdefinedmultiply {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows1=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols1=sc.nextInt();
        int array1[][]=new int[rows1][cols1];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols1;j++){
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                array1[i][j]=sc.nextInt();
            }
        }
        
        System.out.print("Enter the number of rows: ");
        int rows2=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols2=sc.nextInt();
        int array2[][]=new int[rows2][cols2];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<rows2;i++){
            for(int j=0;j<cols2;j++){
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                array2[i][j]=sc.nextInt();
            }
        }
        if(cols1!=rows2){
            System.out.println("Matrix multiplication is not possible");
            
        } else{
            int result[][]=new int[rows1][cols2];
            for(int i=0;i<rows1;i++){
                for(int j=0;j<cols2;j++){
                    result[i][j]=0;
                    for(int k=0;k<cols1;k++){
                        result[i][j]+=array1[i][k]*array2[k][j];
                    }
                }
            }
            System.out.println("Resultant matrix:");
            for(int i=0;i<rows1;i++){
                for(int j=0;j<cols2;j++){
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
