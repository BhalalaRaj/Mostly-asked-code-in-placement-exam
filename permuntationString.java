import java.util.*;
public class permuntationString {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     permuntation(s,"");
     
    }
    public static void permuntation(String s,String set)
    {
        if(s.length()==0)
        {
            System.out.print(set +" ");
            return;
        }
        for (int i = 0; i < s.length(); i++) { 
            char ch = s.charAt(i); 
  
            String ros = s.substring(0, i) +  s.substring(i + 1); 
            permuntation(ros, set + ch); 
    }
    
}
}

