package Day_6;
interface milk{
    String getFlavor();

}
class Cow implements milk{
    public String getFlavor(){return "cow milk is white";}
}
class Goat implements milk{
    public String getFlavor(){return "Goat milk is Gandhi";}
}
class Dog implements milk{
    public String getFlavor(){return "Dog milk is black";}
}
public class interfaces {
    public static void main(String[] args) {
        milk m;
        m=new Cow();
        System.out.println(m.getFlavor());
        m=new Goat();
        System.out.println(m.getFlavor());  
        m=new Dog();
        System.out.println(m.getFlavor());
    }
}
