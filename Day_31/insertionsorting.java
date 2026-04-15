package Day_31;
import java.util.Scanner;
public class insertionsorting{
    public static void shorting(int[] arr,int n){
        for(int i=0;i<=n-1;i++){
            int j=0;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
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
        shorting(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}