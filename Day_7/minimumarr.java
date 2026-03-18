package Day_7;

public class minimumarr {
    static void min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element in the array is: "+min);
    }
    public static void main(String[] args){
        int arr[]={10,20,5,30,40};
        min(arr);
    }
}
