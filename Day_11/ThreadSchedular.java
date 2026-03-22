package Day_11;

class ThreadSchedular extends Thread{
    public ThreadSchedular(String name,int priority){
        super(name);
        setPriority(priority);
    }
    public void run(){
        System.out.println(getName() + " with priority " + getPriority() + " is running.");
    }
    public static void main(String[] args) {
        ThreadSchedular t1=new ThreadSchedular("Thread 1",3);
        ThreadSchedular t2=new ThreadSchedular("Thread 2",7);
        ThreadSchedular t3=new ThreadSchedular("Thread 3",1);
        ThreadSchedular t4=new ThreadSchedular("Thread 4",10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
} 
    

