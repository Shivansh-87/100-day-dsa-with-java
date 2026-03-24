package Day_13;
import java.util.Date;
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
import java.text.SimpleDateFormat; 

class Tasks implements Runnable{
    private String taskname;
    public Tasks(String str){
        this.taskname=str;
    }
    public void run(){
        try{
            for(int j=0;j<=5;j++){
                if(j==0){
                    Date dt=new Date();
                    SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization time for the task name: " + taskname + " = " + sdf.format(dt));
                }else{
                    Date dt=new Date();
                    SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Execution time for the task name: " + taskname + " = " + sdf.format(dt));
                }
                Thread.sleep(1000);
            }
            System.out.println("Task name: " + taskname + " is completed");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}

public class teenmajdoor {
    static final int n=3;
    public static void main(String[] args) {
        Runnable r1=new Tasks("Task 1");
        Runnable r2=new Tasks("Task 2");
        Runnable r3=new Tasks("Task 3");
        Runnable r4=new Tasks("Task 4");
        Runnable r5=new Tasks("Task 5");

        ExecutorService pool=Executors.newFixedThreadPool(n);
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);   
        pool.shutdown();
    }
}
