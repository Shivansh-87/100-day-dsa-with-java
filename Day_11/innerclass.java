package Day_11;

class child{
    String name;

    child(String name){
        this.name=name;
    }

    class Addres{
        String city;
        String state;

        Addres(String city, String state){
            this.city=city;
            this.state=state;
        }
        void display(){
            System.out.println("Name: "+name);
            System.out.println("City: "+city);
            System.out.println("State: "+state);
        }
    }
}
public class innerclass {
    public static void main(String[] args) {
        child c=new child("john");
        child.Addres a=c.new Addres("New York","NY");
        a.display();
    }
}
