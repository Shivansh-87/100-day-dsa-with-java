package Day_10;

public class finalexample {
    public static void main(String[] args) {
        try{
            int data=25/0;
            System.out.println("Result: " + data);
        }catch(ArithmeticException e){
            System.out.println("An error occurred: " + e.getMessage());
        }finally{
            System.out.println("This block will always execute, regardless of exceptions.");
        }
    }
}
