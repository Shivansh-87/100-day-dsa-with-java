package Day_31;

import java.util.Scanner;

public class selectionssort {
    public static void sorts(int[] arr,int n){
        for(int i=0;i<=n-2;i++){
            int mini=i;

            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
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
        sorts(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
