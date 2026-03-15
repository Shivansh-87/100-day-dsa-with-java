package Day_4;

class Student {
    int id;
    String name;
    Student(int i,String n){
        id=i;
        name=n;
    }
    Student(){}
    void display(){
        System.out.println(id+" "+name);
    }
}
public class woutcpconstructor{
    public static void main(String[] args) {
        Student s1=new Student(101,"hiva");
        Student s2=new Student();
        s2.id=s1.id;
        s2.name=s1.name;
        s1.display();
        s2.display();
    }
}
