package Day_5;
// example of hierariacal inheritance
class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class Cat extends Animal{
    void meow(){System.out.println("meowing...");}
}
public class hierarical {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.eat();
        c.meow();
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}
