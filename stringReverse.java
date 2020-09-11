
import java.util.Scanner;

public class stringReverse {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("reverse of string :" + reverse(s));
    }
    public static String reverse(String s)
    {
        if(s==null||s.isEmpty())
        {
            return s;
        }
       return s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
    }
}
