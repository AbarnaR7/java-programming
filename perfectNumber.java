/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("enter number:");
		int n=s.nextInt();
		int i, sum=0;
		for(i=1;i<=n/2;i++)
		{
		    if(n%i==0)
		    {
		        sum=sum+i;
		    }
		}
		if(sum==n)
		{
		    System.out.println("perfect number");
		}
		else
		{
		    System.out.println("not a perfect number");
		}
	}
}
