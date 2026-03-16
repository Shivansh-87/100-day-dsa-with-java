package Day_5;
//uses of super keyword

class Gaadi{
    String color="white";
}
class Thar extends Gaadi{
    String color="black";
    void printColor(){
        System.out.println(super.color);
    }
}
public class superseupar {
    public static void main(String[] args) {
        Thar d=new Thar();
        d.printColor();
    }
    
}
