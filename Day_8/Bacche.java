package Day_8;
//The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create.
//  If we do not implement Cloneable interface, Object.clone() method generates CloneNotSupportedException.
class Balak implements Cloneable{
    int id;
    String name;
    Balak(int id,String name){
        this.id=id;
        this.name=name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class Bacche {
    public static void main(String[] args) {
        try{
            Balak b1=new Balak(1,"Kaju");
            Balak b2=(Balak)b1.clone();
            System.out.println("Original Student Object: " + b1.id + " - " + b1.name);
            System.out.println("Cloned Student object: " + b2.id + " - " + b2.name);
            b2.name="Badam";
            System.out.println("After modifying the cloned object:");
            System.out.println("Original Student Object: " + b1.id + " - " + b1.name);
            System.out.println("Cloned Student object: " + b2.id + " - " + b2.name);
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
    
}
