
import java.util.Scanner;


public class integerPlaindrom {
    public static void main(String[] args)
    {
        System.out.println("enter number");
        int number = new Scanner(System.in).nextInt();
        System.out.println("number is palindrome :" + ispalindrome(number));
    }
    public static boolean ispalindrome(int abc)
    {
        int no = abc;
        int palindrom = 0;
        while(no!=0)
        {
            int remainder = no%10;
            palindrom = palindrom * 10 + remainder;
            no = no/10;
        }
        if(abc==palindrom)
        {
            return true;
        }
        return false;
    }
    
}
