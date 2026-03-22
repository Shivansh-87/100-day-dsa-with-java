package Day_11;

class clientRequest extends Thread{
    private String clientName;

    clientRequest(String name){
        this.clientName=name;
    }
    public void run(){
        System.out.println(clientName + " request processing started.");
        try{
            Thread.sleep(1500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(clientName + " request processing completed.");
    }
    public static void main(String[] args) {
        clientRequest c1=new clientRequest("Client A");
        clientRequest c2=new clientRequest("Client B");
        clientRequest c3=new clientRequest("Client C");

        c1.start();
        c2.start();
        c3.start();
    }
}
