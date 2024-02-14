/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
String s="book";
char s1[]=s.toCharArray();
int count1=0,count2=0;
for(int i=0;i<s1.length/2;i++)
{
    if(s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='0'||s1[i]=='u')
    count1++;
}
for(int i=s1.length-1;i>=s1.length/2;i--)
{
    if(s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='0'||s1[i]=='u')
    count2++;
}
if(count1==count2)
System.out.println("alike");
else
System.out.println("not alike");
}
}
