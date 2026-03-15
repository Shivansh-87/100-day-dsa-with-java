package Day_4;

/**
 * Java Copy Constructor Example
 * In this example, we are going to copy the values of one object into another using a Java constructor.
 */

class Student {
    int id;
    String name;

    Student(int i,String n){
        id=i;
        name=n;
    }
    Student(Student s){
        id=s.id;
        name=s.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
public class copyConstructor{
    public static void main(String[] args){
        Student s1=new Student(101,"Shiva");
        Student s2=new Student(s1);
        s1.display();
        s2.display();
    }
}
