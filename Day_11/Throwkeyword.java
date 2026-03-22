package Day_11;

public class Throwkeyword {
    public static void main(String[] args) {
        int age=15;
        if(age<18){
            throw new ArithmeticException("Age must be at least 18 to vote.");
        }
        System.out.println("You are eligible to vote.");
    }
}
