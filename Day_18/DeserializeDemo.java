package Day_18;

import java.io.*;

public class DeserializeDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();  // deserialize

            ois.close();
            fis.close();

            System.out.println(s.id + " " + s.name);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
