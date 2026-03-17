package Day_6;
class chocolate{}
class milk extends chocolate{}
class dark extends chocolate{}
public class instanceofffff {
    public static void main(String[] args) {
        chocolate a=new dark();
        if(a instanceof milk){
            milk b=(milk)a;
        }else{
            System.out.println("a is not an instance of milk");
        }
    }
}
