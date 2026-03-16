package Day_5;
//Real-Time Example of Aggregation
class Address{
    String city,state,country;

    public Address(String city, String state, String country){
        this.city=city;
        this.state=state;
        this.country=country;
    }
}

class Employee{
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }
}
public class ghar {
    public static void main(String[] args) {
        Address address1=new Address("gzb","UP","india");    
        Address address2=new Address("gno","UP","india");    
        Employee e=new Employee(111,"varun",address1);    
        Employee e2=new Employee(112,"arun",address2);

        e.display();
        e2.display();
    }
}
