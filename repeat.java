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
	    System.out.print("enter positive integer:");
	    int n=s.nextInt();
	    while(true)
	    {
	    int temp=n,sum=0,r;
	    while(n>0)
	    {
	         r=n%10;
	        sum=(sum*10)+r;
	        n=n/10;
	    }
	   int rev=temp+sum;
	    int n2=rev;
	       int sum1=0;
	   	    while(n2>0)
	    {    
	         r=n2%10;
	        sum1=(sum1*10)+r;
	        n2=n2/10;
	    }
    if(rev==sum1)
    {
        System.out.print(sum1);
        break;
    }
	}
}
}
