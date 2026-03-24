package Day_13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class worker extends Thread{
    private String message;
    public worker(String msg){
        this.message=msg;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"processing"+message);
    }
}
public class majdur {
    public static void main(String[] args) {
        ExecutorService executor=Executors.newFixedThreadPool(2);
        for(int i=0;i<5;i++){
            executor.execute(new worker("task"+i));
        }
        executor.shutdown();
    }
}
