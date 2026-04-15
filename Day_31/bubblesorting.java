package Day_31;

import java.util.Scanner;

public class bubblesorting {
    public static void shorts(int[] arr,int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){

                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length: ");
        int n=sc.nextInt();
        System.out.println("enter the elements upto" +n + " :");
        int[] arr=new int[n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        shorts(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
