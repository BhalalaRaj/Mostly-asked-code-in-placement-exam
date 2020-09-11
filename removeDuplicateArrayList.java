
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class removeDuplicateArrayList {
    public static void main(String[] args)
    {
        List<Integer> prime = new ArrayList<Integer>();
        for(int i=0;i<5;i++)
        {
            int a = new Scanner(System.in).nextInt();
            prime.add(a);
        }
        System.out.println(prime);
        Set<Integer> primesWithoutDuplicates = new LinkedHashSet<Integer>(prime);
        prime.clear();
        prime.addAll(primesWithoutDuplicates);
        System.out.println(prime);
    }    
}
