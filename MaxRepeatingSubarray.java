import java.util.*;
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
   String sequence="ababc";
   String word ="ab";
   int result=maxRepeating(sequence,word);
   if(result!=0)
   {
   System.out.println(result);
	}
	else
	{
   System.out.println(-1);

	}
	}
public static int maxRepeating(String sequence,String word)
{   int count=0;
    StringBuilder sb=new StringBuilder();
    sb.append(word);
    while(sequence.contains(sb))
    {
        count++;
        sb.append(word);
    }
    return count;
}
}
