package Day_12;

class TestMehthod extends Thread{
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
        TestMehthod t1 = new TestMehthod();
        TestMehthod t2 = new TestMehthod();
        TestMehthod t3 = new TestMehthod();
        t1.start();
        try{
            t1.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        t2.start();
        t3.start();

    }
}