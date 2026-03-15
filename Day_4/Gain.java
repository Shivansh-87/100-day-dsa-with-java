package Day_4;
// us take an example to demonstrate how we can call the user defined function in Java.

public class Gain{
    static void greet(){
        System.out.println("Hello, welcome to Java programming!");
    }
    void farewell(){
        System.out.println("Goodbye, see you next time!");
    }
    public static void main(String[] args){
        Gain obj=new Gain();
        obj.farewell();
        Gain.greet();
    }
}