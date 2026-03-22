package Day_11;

public class exppropogation {
    void method3(){
        int data=50/0;
    }
    void method2(){
        method3();
    }
    void method1(){
        try{
            method2();
        }
        catch(ArithmeticException e){
            System.out.println("Exception handled in method1: " + e.getMessage());
        }
       
    }
    public static void main(String[] args) {
        exppropogation obj=new exppropogation();
        obj.method1();
    }
}
