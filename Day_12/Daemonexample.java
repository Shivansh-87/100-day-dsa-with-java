package Day_12;

public class Daemonexample extends Thread {
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread work");
        }else{
            System.out.println("User thread work");
        }
    }
    public static void main(String[] args) {
        Daemonexample t1=new Daemonexample();
        Daemonexample t2=new Daemonexample();
        Daemonexample t3=new Daemonexample();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
