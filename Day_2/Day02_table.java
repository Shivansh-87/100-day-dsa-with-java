package Day_2;

public class Day02_table {
    public static void main(String[] args){
        int i=1;
        while(i<=10){
            int j=1;
            while(j<=10){
                System.out.print(i*j+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
