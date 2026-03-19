package Day_8;

public class arrayobject{
    public static void main(String[] args) {
        Product[] obj=new Product[3];
        obj[0]=new Product(1,"Laptop",50000);
        obj[1]=new Product(2,"Mobile",20000);
        obj[2]=new Product(3,"Tablet",30000);

        System.out.println("product obj1: ");
        obj[0].display();
        System.out.println("product obj2: ");
        obj[1].display();
        System.out.println("product obj3: ");
        obj[2].display();
    }
}
class Product{
    int id;
    String name;
    double price;

    Product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public void display(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("price: "+price);
        System.out.println("-----------------------");
    }
}