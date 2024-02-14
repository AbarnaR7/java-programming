
import java.util.*;
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
String s1="abarna is my name";
String rev="";
String s[]=s1.split(" ");
for(int i=0;i<s.length;i++)
{
    rev=s[i]+" "+rev;
}
System.out.println(rev);
}
}
