package Day_7;

import java.util.Scanner;    
public class Dyanmicjagged {    
public static void main(String[] args) {   

  
    Scanner scanner = new Scanner(System.in);    
  
    System.out.print("Enter the number of sub-arrays: ");    
    int numberOfArrays = scanner.nextInt();      
    int[][] jaggedArray = new int[numberOfArrays][];    
    
    for (int i = 0; i < numberOfArrays; i++) {    
          
        System.out.print("Enter the size of sub-array " + (i + 1) + ": ");    
        int sizeOfSubArray = scanner.nextInt();    
        
        jaggedArray[i] = new int[sizeOfSubArray];    
        
        for (int j = 0; j < sizeOfSubArray; j++) {    
            System.out.print("Enter the element at index " + j + " of sub-array " + (i + 1) + ": ");    
            jaggedArray[i][j] = scanner.nextInt();    
        }    
    }    

    System.out.println("The jagged array is:");    
    for (int i = 0; i < numberOfArrays; i++) {    
        for (int j = 0; j < jaggedArray[i].length; j++) {    
            System.out.print(jaggedArray[i][j] + " ");    
        }    
        System.out.println();    
    }    
    // Close the scanner object    
    scanner.close();    
}    
}    