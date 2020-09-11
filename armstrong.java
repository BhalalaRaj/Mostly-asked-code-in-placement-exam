
import java.util.Scanner;

public class armstrong {
   public static void main (String[] args)
   {
       int number = new Scanner(System.in).nextInt();
       System.out.println("is armstrong :" + isarmstrong(number));
       
   }
   public static boolean isarmstrong(int number)
   {
       int no = number;
       int armstrong=0;
       while(no!=0)
       {
           int remainder = no%10;
           armstrong = armstrong + (remainder*remainder*remainder);
           no = no/10;
       }
       if(number==armstrong)
       {
           return true;
       }
       return false;
   }
    
}
