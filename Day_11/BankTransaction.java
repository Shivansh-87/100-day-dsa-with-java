package Day_11;

class BankTransaction extends Thread{
    private String transactionName;

    BankTransaction(String name){
        this.transactionName=name;
    }
    public void run(){
        System.out.println(transactionName+" started.");
        try{
            Thread.sleep(2000); // Simulate time taken for transaction
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(transactionName+" completed.");
    }
    public static void main(String[] args) {
        BankTransaction t1=new BankTransaction("Deposit");
        BankTransaction t2=new BankTransaction("Withdrawal");
        BankTransaction t3=new BankTransaction("Transfer");

        t1.start();
        t2.start();
        t3.start();
    }
} 
    

