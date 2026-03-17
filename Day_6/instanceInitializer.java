package Day_6;

class instanceInitializer {
    int speed;

    instanceInitializer(){
        System.out.println("constructor is invoked");
    }
    {
        System.out.println("instance initializer block is invoked");
    }
    public static void main(String[] args) {
        instanceInitializer obj= new instanceInitializer();
        instanceInitializer obj1= new instanceInitializer();
    }
}
