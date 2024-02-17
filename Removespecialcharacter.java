import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	String s="Abar12na@R*a#gu";
	String str="";
	for(int i=0;i<s.length();i++)
	{
	    if(Character.isDigit(s.charAt(i))||Character.isLetter(s.charAt(i))||Character.isWhitespace(s.charAt(i)))
	    {  
	        str=str+s.charAt(i);
	    }
	}
       System.out.println(str);
}
}
