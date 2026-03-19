package Day_8;

public class unboxing {
    public static void main(String[] args) {
        Integer i=new Integer(10);//Converting Integer to int    
        int a=i.intValue();    //converting Integer to int explicitly  

        int b=i;   //unboxing, now compiler will write a.intValue() internally  
        System.out.println(a+" "+b);

    }
}
