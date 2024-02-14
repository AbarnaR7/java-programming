import java.util.*;
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
   String s="The quick brown fox jumps over the lazy dog";
    s=s.toLowerCase();
    int flag=1;
    for(char i='a';i<='z';i++)
    {
        if(!s.contains(s.valueOf(i)))
        {
            flag=0;
            break;
        }
        
    }
 if(flag==1)
 {
     System.out.println("pangram");
 }
 else
 System.out.println("not pangram");
}
}
