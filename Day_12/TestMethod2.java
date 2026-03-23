package Day_12;

class TestMethod2 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        TestMethod2 t1=new TestMethod2();
        TestMethod2 t2=new TestMethod2();
        TestMethod2 t3=new TestMethod2();
        t1.start();
        try{
            t1.join(1500);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}
