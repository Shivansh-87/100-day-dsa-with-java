package Day_20;

import java.util.*;    
  
class Person {    
 private String name;    
 private int age;    
  
 public Person(String name, int age) {    
  this.name = name;    
  this.age = age;    
 }    
  
 public int hashCode() {    
  return name.hashCode() + age;    
 }    
  
 public boolean equals(Object o) {    
  if (this == o) return true;    
  if (!(o instanceof Person)) return false;    
  Person p = (Person)o;    
  return age == p.age && name.equals(p.name);    
 }    
  
 public String toString() {    
  return name + " " + age;    
 }    
}    
  
public class Persons {    
 public static void main(String[] args) {    
  HashSet<String> set = new HashSet<String>();    
  set.add("Rahul");    
  set.add("Priya");    
  set.add("Amit");    
  
  System.out.println("HashSet: " + set);    
  
  Iterator<String> it = set.iterator();    
  while(it.hasNext()){    
    System.out.print(it.next()+" ");    
  }    
  
  String[] arr = set.toArray(new String[0]);    
  System.out.println("\nArray: "+Arrays.toString(arr));    
  
  HashSet<Person> pset = new HashSet<Person>();    
  pset.add(new Person("Rahul",30));    
  pset.add(new Person("Priya",25));    
  
  System.out.println("Custom Objects: "+pset);    
 }    
}    
