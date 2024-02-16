import java.util.*;
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   System.out.print("enter number:");
   int n=s.nextInt();
   System.out.println("factorial of "+n+" is "+fact(n));
	}
	public static int fact(int n)
	{
	    if(n==1)
	    return n;
	    return n*fact(n-1);
	}
}
