/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
   String haystack="hello";
   String needle="ll";
   System.out.println(Occurance(haystack,needle));
}
static int Occurance(String haystack,String needle)
{
    for(int i=0;i<haystack.length();i++)
{
    if(haystack.charAt(i)==needle.charAt(0))
    {
        if(haystack.substring(i,needle.length()+i).equals(needle))
        {
            return i;
        }
    }
}
      return -1;
  
}
}
