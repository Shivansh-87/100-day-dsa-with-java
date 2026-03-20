package Day_9;
enum Days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class enumexample {
    public static void main(String[] args) {
        Days d=Days.MONDAY;
        System.out.println("Today is: "+d);

        System.out.println("All days of the week:");
        for(Days day:Days.values()){
            System.out.println(day);
        }
    }
}
