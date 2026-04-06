package Day_26;

public class patternsfunction {
    public static void pattern12(int n){

        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num +=1;
            }
            System.out.println();
        }
    }

    public static void pattern13(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void pattern14(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+(n-i-1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void pattern15(int n){
        
        for(int i=0;i<n;i++){
            char ch=(char)('A'+ i);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        //pattern12(n);
        //pattern13(n);
        //pattern14(n);
        pattern15(n);
    }
}
