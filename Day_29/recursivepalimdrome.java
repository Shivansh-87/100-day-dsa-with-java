package Day_29;

public class recursivepalimdrome {
    public static boolean check(int i, String s){
        if(i>s.length() /2) return true;

        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;

        return check(i+1,s);

    }
    public static void main(String[] args) {
        String s="Madum";
        System.out.println(check(0,s));
    }
}
