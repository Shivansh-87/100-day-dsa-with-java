package Day_18;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) {
        try{
            Student s1=new Student(101,"shivansh");

            FileOutputStream fos=new FileOutputStream("student.ser");
            ObjectOutputStream oss=new ObjectOutputStream(fos);
            oss.writeObject(s1);

            oss.close();
            fos.close();
            System.out.println("Object serialized successfully");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
