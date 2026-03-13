class Rect {
    int length;
    int breadth;
    void insert(int l,int b){
        length=l;
        breadth=b;
    }
    void display(){
        System.out.println(length*breadth);
    }
}
public class Rectangle{
    public static void main(String[] args) {
        Rect l1=new Rect();
        // Rectangle r1=new Rectangle(),r2=new Rectangle();
        l1.insert(2,3);
        l1.display();
    }
}
