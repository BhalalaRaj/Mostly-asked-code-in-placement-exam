
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] a)
    {
        System.out.println("Enter a number:");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Fibonacci series upto " + number +" numbers : ");
        for(int i=0; i<number; i++){
            System.out.print(fibonacci(i) +" ");
    }  
}
    public static int fibonacci(int number){
        if(number==0)
        {
            return 0;
        }
        else if(number ==1||number==2){ 
            return 1;
        }
        else{
        return fibonacci(number-1) + fibonacci(number -2);
        }
    } 
    }


