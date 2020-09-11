
import java.util.Scanner;

public class palindrom {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Is string palindrome :"+ispalindrome(s));
    }
    public static boolean ispalindrome(String text)
    {
        String reverse = reverse(text);
        if(text.equals(reverse))
        {
            return true;
        }
        return false;
    }
    public static String reverse(String input)
    {
        if(input==null||input.isEmpty())
        {
            return input;
        }
        return input.charAt(input.length()-1)+reverse(input.substring(0,input.length()-1));
    }
}
