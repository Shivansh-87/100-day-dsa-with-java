package Day_9;
class F{
    static int n1=0, n2=1, n3=0;
    static void printFibo(int count){
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
            printFibo(count-1);
        }
    }
}
public class Fibonaccirecursive {
    public static void main(String[] args) {
        int count=10;
        System.out.print(F.n1+" "+F.n2+" ");
        F.printFibo(count-2);
    }
}
