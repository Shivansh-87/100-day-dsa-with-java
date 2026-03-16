package Day_5;
// HAS-A relationship (Composition) example: A circle has an operation
//  to calculate the area of the circle using the formula A=πr^2.
//  The circle class contains an instance of the operation class to perform the calculation.
class operation{
    int square(int n){
        return n*n;
    }
}
class circle{
    operation op;
    double pi=3.14;

double area(int radius){
    op=new operation();
    int rsquare=op.square(radius);
    return pi*rsquare;
}
}
public class circlehasa {
    public static void main(String[] args) {
        circle c=new circle();
        double result=c.area(5);
        System.out.println("Area of circle is: "+result);
    }
}
