package Day_13;
class merathread extends Thread{
    public void run(){
        System.out.println("shutdown hook task completed");
    }
}
public class shutdown {
    public static void main(String[] args) {
        Runtime r=Runtime.getRuntime();
        r.addShutdownHook(new merathread());

        System.out.println("Now main sleeping... press ctrl+c to exit");
        try{
            Thread.sleep(3000);
        }catch(Exception e){
            
        }
    }
}
