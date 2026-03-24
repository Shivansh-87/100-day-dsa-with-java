package Day_13;
class Mytask extends Thread{
    Mytask(ThreadGroup group, String name){
        super(group,name);
    }
    public void run(){
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}
public class ThreadGroupexample {
    public static void main(String[] args) {
        ThreadGroup tg=new ThreadGroup("My Thread Group");
        Mytask t1=new Mytask(tg,"Thread 1");
        Mytask t2=new Mytask(tg,"Thread 2");

        t1.start();
        t2.start();
    }
}
