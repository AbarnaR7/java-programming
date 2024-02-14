
import java.util.*;
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
String s1="lets do it";
String rev="";
String s[]=s1.split(" ");

for(int i=0;i<s.length;i++)
{
    rev=rev+" "+reverse(s[i]);
}
System.out.println(rev);
}
public static String reverse(String s)
{
    StringBuilder sb=new StringBuilder(s);
sb.reverse();
return sb.toString();
}
}
