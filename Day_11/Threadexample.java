package Day_11;
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread is running: "+i);
        }
    }
}
public class Threadexample {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
    }
}
