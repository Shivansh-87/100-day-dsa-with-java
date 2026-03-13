class employee1 {
    int id;
    String name;
    float salary;
    void insert(int i,String n,float s){
        id=i;
        name=n;
        salary=s;
    }
    void display(){
        System.out.println(id+""+name+""+salary);
    }
}
public class employee{
    public static void main(String[] args) {
        employee1 e1=new employee1();
        employee1 e2=new employee1();
        e1.insert(90,"john",45000);
        e2.insert(91,"doe",55000);
        e1.display();
        e2.display();
    }
}
