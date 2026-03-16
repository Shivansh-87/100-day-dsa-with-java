package Day_5;
//Java Program to demonstrate the real scenario of Java Method Overriding      
//where three classes are overriding the method of a parent class.      
class Bank{
    int getRateofInterest(){return 0;}
}
class SBI extends Bank{
    int getRateofInterest(){return 8;}
}
class ICICI extends Bank{
    int getRateofInterest(){return 7;}
}
class AXIS extends Bank{
    int getRateofInterest(){return 9;}
}
public class RBI {
    public static void main(String[] args) {
        Bank b=new Bank();
        System.out.println(b.getRateofInterest());
        SBI s=new SBI();
        System.out.println(s.getRateofInterest());
        ICICI i=new ICICI();
        System.out.println(i.getRateofInterest());
        AXIS a=new AXIS();
        System.out.println(a.getRateofInterest());
    }
}
