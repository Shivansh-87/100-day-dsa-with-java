package Day_10;

public class Errorsexample {
    public static void recursiveCall(){
        recursiveCall(); // This will cause a StackOverflowError
    }
    public static void main(String[] args) {
        try{
            recursiveCall();

        }catch(StackOverflowError e){
            System.out.println("A StackOverflowError occurred: " + e.getMessage());
        }
    

    try{
        int[] largeArray=new int[Integer.MAX_VALUE];
    }catch(OutOfMemoryError e){
        System.out.println("An OutOfMemoryError occurred: " + e.getMessage());

    }
}
}
