package Day_13;

public class oddevenexample {
    int c=1;
    static int NUM;

    public void displayOddNum(){
        synchronized(this){
            while(c<NUM){
                while(c%2==0){
                    try{
                        wait();
                    }catch(InterruptedException e){}
                }
                System.out.println(c +" ");
                c++;
                notify();
            }
        }
    }
    public void displayEvenNum(){
        synchronized(this){
            while(c<NUM){
                while(c%2==1){
                    try{
                        wait();
                    }catch(InterruptedException e){}
                }
                System.out.println(c +" ");
                c++;
                notify();
            }
        }
    }
    public static void main(String[] args) {
        NUM=20;
        oddevenexample oe=new oddevenexample();

        Thread t1=new Thread(()-> oe.displayEvenNum());
        Thread t2=new Thread(()-> oe.displayOddNum());

        t1.start();
        t2.start();
    }
}
