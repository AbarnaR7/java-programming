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
	    int i,j;
	    Scanner s=new Scanner(System.in);
		System.out.println("enter string1");
		String str1=s.nextLine();
		char s1[]=str1.toCharArray();
		Arrays.sort(s1);
		System.out.println("enter string1");
		String str2=s.nextLine();
		char s2[]=str2.toCharArray();
				Arrays.sort(s2);
				if(Arrays.equals(s1,s2))
				{
				    System.out.println("anagram");
				}
				else{
				    System.out.println("not anagram");
				}

	}
}
