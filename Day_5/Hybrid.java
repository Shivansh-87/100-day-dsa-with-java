package Day_5;
// example of hybrid inheritance through interfaces

interface car{
    void run();
}
interface jeep{
    void jump();
}
class vehicle implements car, jeep{
    public void run(){System.out.println("Car is running...");}
    public void jump(){System.out.println("Jeep is jumping...");}

}

public class Hybrid {
    public static void main(String[] args) {
        vehicle v=new vehicle();
        v.run();
        v.jump();
    }
    
}
