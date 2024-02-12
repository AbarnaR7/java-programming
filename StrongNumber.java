/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		int temp=n;
		int r, result=0;
		while(n>0)
		{
		    r=n%10;
		    result=result+fact(r);
		    n=n/10;
		}
		if(temp==result)
		{
		    System.out.println("Strong number");
		}
		else{
		     System.out.println("not Strong number");

		}
	}
 public static int fact(int n)
 
{
    if(n==0)
    {
        return 1;
    }
    else
    {
        return(n*fact(n-1));
    }
    }
}
