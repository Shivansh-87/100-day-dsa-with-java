package Day_19;

import java.util.*;    
    public class Stackexample {    
        public static void main(String args[]) {    
        Stack<String> stack = new Stack<String>();    
        stack.push("CPU");    
        stack.push("Monitor");    
        stack.push("Mouse");    
        stack.push("Keyboard");    
        stack.push("Printer");  
        stack.pop();    
        Iterator<String> itr=stack.iterator();    
        while(itr.hasNext()) {    
            System.out.println(itr.next());    
        }    
    }    
}  