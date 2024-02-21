import java.util.*;
public class Main
{
	public static void main(String[] args) {
String s="A man, a plan, a canal: Panama";
     s=s.toLowerCase();
     s=s.replace(" ","");
     String s1="";
     for(int i=0;i<s.length();i++)
{
    if(Character.isDigit(s.charAt(i))||Character.isLetter(s.charAt(i))||Character.isWhitespace(s.charAt(i)))
    {
        s1=s1+s.charAt(i);
    }
}
String rev="";
for(int i=s1.length()-1;i>=0;i--)
{
    rev=rev+s1.charAt(i);
}
if(rev.equals(s1))
    {
        System.out.print("true");
    }
    else{
                System.out.print("false");

        
    }
	}
}
