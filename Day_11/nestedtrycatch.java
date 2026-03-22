package Day_11;

public class nestedtrycatch {
    public static void main(String[] args) {
        try{
            int[] no={1,2,3};
            System.out.println("outer try block start");
            try{
            int result=no[1]/0;

            }catch(ArithmeticException e){
                System.out.println("Arithmetic Exception: " + e.getMessage());
            }

            System.out.println(no[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
    }
    System.out.println("Program continues after handling exceptions.");
}
}
