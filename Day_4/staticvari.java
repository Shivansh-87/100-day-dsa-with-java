package Day_4;
    
/**
 * Example of Static Variable
 * The following example demonstrate the static variable in Java.
 */
class longes {
    int id;
    String name;
    static String college = "ITS"; // static variable

    longes(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}
public class staticvari{
    public static void main(String[] args) {
        longes s1 = new longes(111, "Karan");
        longes s2 = new longes(222, "Aryan");
        // We can change the college of all students by changing the static variable
        longes.college = "IIT";
        s1.display();
        s2.display();
    }
}
