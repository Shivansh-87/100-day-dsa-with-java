package Day_5;
// Method Overloading example: The Adder class has two add
// methods with the same name but different parameters. The first add method takes two integers and returns their sum, while the second add method takes three integers and returns their sum. This demonstrates method overloading, where multiple methods can have the same name but different parameter lists.
class Adder{
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
}
public class sumoverloading {
    public static void main(String[] args) {
        System.out.println(Adder.add(10,20));
        System.out.println(Adder.add(10,20,30));
    }
}
