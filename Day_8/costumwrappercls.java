package Day_8;

class javatpoint{
    private int i;
    javatpoint(){}
    javatpoint(int i){
        this.i=i;
    }
    public int getValue(){
        return i;
    }
    public void setValue(int i){
        this.i=i;
    }
    public String toString(){
        return Integer.toString(i);
    }
}
public class costumwrappercls {
    public static void main(String[] args) {
        javatpoint j=new javatpoint(10);
        System.out.println(j);
    }
}