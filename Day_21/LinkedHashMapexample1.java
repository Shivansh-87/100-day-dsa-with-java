package Day_21;
import java.util.*;

class Book{
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id,String name, String author, String publisher, int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
    }
}
public class LinkedHashMapexample1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Book> map=new LinkedHashMap<Integer,Book>();

        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

        map.put(2,b2);
        map.put(1,b1);
        map.put(3,b3);

        for(Map.Entry<Integer,Book>entry:map.entrySet()){
            int key=entry.getKey();
            Book b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println("ID: "+b.id+", Name: "+b.name+", Author: "+b.author+", Publisher: "+b.publisher+", Quantity: "+b.quantity);
        }
    }
}
