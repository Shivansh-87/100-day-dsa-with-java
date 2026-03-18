package Day_7;

public class Test {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.setAccNo(123456789);
        a1.setName("Shivaji");
        a1.setEmail("jaggajasus.com");
        a1.setAmount(10000);
        System.out.println("Account No: "+a1.getAccNo());
        System.out.println("Name: "+a1.getName());  
        System.out.println("Email: "+a1.getEmail());
        System.out.println("Amount: "+a1.getAmount());
        
    }
}
