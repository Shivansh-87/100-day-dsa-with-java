package Day_13;

class RemoveHookExample {

    // Inner class (Shutdown Hook)
    static class Msg extends Thread {
        public void run() {
            System.out.println("Byee...");
        }
    }

    // Main method
    public static void main(String[] args) {

        try {
            // Creating object of Msg class
            Msg ms = new Msg();

            // Adding shutdown hook
            Runtime.getRuntime().addShutdownHook(ms);

            // Normal execution
            System.out.println("The program is beginning ...");
            System.out.println("Waiting for 2 seconds ...");

            Thread.sleep(2000);

            // Removing shutdown hook
            Runtime.getRuntime().removeShutdownHook(ms);

            // Program ending
            System.out.println("The program is terminating ...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
