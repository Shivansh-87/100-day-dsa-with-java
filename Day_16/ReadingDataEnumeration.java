package Day_16;
import java.io.*;
import java.util.*;

public class ReadingDataEnumeration {
    public static void main(String[] args) throws Exception{
        FileInputStream fin=new FileInputStream("D:\\a.txt");    
        FileInputStream fin2=new FileInputStream("D:\\b.txt");    
        FileInputStream fin3=new FileInputStream("D:\\c.txt");    
        FileInputStream fin4=new FileInputStream("D:\\d.txt");    

        Vector v=new Vector<>();
        v.add(fin);    
        v.add(fin2);    
        v.add(fin3);    
        v.add(fin4);

        Enumeration e=v.elements();
        SequenceInputStream bin=new SequenceInputStream(e);

        int i=0;      
        while((i=bin.read())!=-1){    
            System.out.print((char)i);    
        }

        bin.close();    
        fin.close();    
        fin2.close(); 
    }
}


/// new methods this using ArrayList
/// 
// import java.io.*;
// import java.util.*;

// public class InputModern {
//     public static void main(String[] args) throws IOException {

//         FileInputStream fin1 = new FileInputStream("D:\\a.txt");
//         FileInputStream fin2 = new FileInputStream("D:\\b.txt");
//         FileInputStream fin3 = new FileInputStream("D:\\c.txt");
//         FileInputStream fin4 = new FileInputStream("D:\\d.txt");

//         // Modern collection
//         ArrayList<InputStream> list = new ArrayList<>();
//         list.add(fin1);
//         list.add(fin2);
//         list.add(fin3);
//         list.add(fin4);

//         // Convert list → Enumeration (required by SequenceInputStream)
//         Enumeration<InputStream> e = Collections.enumeration(list);

//         SequenceInputStream bin = new SequenceInputStream(e);

//         int i;
//         while ((i = bin.read()) != -1) {
//             System.out.print((char) i);
//         }

//         bin.close();
//         fin1.close();
//         fin2.close();
//         fin3.close();
//         fin4.close();
//     }
// }
