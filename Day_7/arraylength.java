package Day_7;

public class arraylength {
    public static void LengthOfArray(String[] array) {
        if(array==null){
            System.out.println("array is empty, cannot find length");
        }else{
            int arrayLength=array.length;
            System.out.println("Length of the array: " + arrayLength);
        }
    }
    public static void main(String[] args) {
        String[] fruits={"Apple", "Banana", "Cherry", "Date"};
        String[] alphabets={"A", "B", "C", "D", "E"};
        String[] number={"12", "34", "56", "78", "90"};
        LengthOfArray(null);
        LengthOfArray(fruits);
        LengthOfArray(alphabets);
        LengthOfArray(number); // This will print the message for an empty array

    }
}
