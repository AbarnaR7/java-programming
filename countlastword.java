import java.util.*;
public class Main
{
	public static void main(String[] args) {
 String s="hello me to world";
 String s1[]=s.split(" ");
 int len=s1[s1.length-1].length();
 int count=0;
 for(int i=0;i<len;i++)
 {
     count++;
 }
 System.out.print(count);
	}
}
