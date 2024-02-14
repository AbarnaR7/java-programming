
import java.util.*;
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
String s1="welcome chella software";
int a=0,e=0,i=0,o=0,u=0;
for(int j=0;j<s1.length();j++)
{
if(s1.charAt(j)=='a')
{
    a++;
}
if(s1.charAt(j)=='e')
{
    e++;
}
if(s1.charAt(j)=='i')
{
    i++;
}
if(s1.charAt(j)=='o')
{
    o++;
}
if(s1.charAt(j)=='u')
{
    u++;
}
}
System.out.print("a="+(a*2)+" e="+(e*8)+" i="+(i*0)+" o="+(o*1)+" u="+(u*5));
}
}
