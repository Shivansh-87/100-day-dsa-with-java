package Day_14;

public class avoiddeadlock {
    public static void main(String[] args) {
        avoiddeadlock test=new avoiddeadlock();

        final resource1 a=test.new resource1();
        final resource2 b=test.new resource2();

        Runnable t1=new Runnable(){
            public void run(){
                synchronized(b){
                    try{
                        Thread.sleep(100);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized(a){
                        System.out.println("In bloclk 1");
                    }
                }
            }
        };
        Runnable t2=new Runnable(){
            public void run(){
                synchronized(b){
                    synchronized(a){
                        System.out.println("In block2");
                    }
                }
            }
        };
        new Thread(t1).start();
        new Thread(t2).start();
    }
        private class resource1 {
            private int i=10;
            public int getI(){
                return i;
            }
            public void setI(int i){
                this.i=i;
            }    
        }
        private class resource2{
            private int i=20;
            public int getI(){
                return i;
            }
            public void setI(int i){
                this.i=i;
            }
            
        }

    
}
