import java.util.*;
public class Main
{    
public static int reverse(int n)
{
    int temp=n;
    int r,sum=0;
    while(n>0)
    {
        r=n%10;
        sum=(sum*10)+r;
        n=n/10;
    }
    return sum;
}
	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
	    System.out.print("enter positive integer:");
	    int n=s.nextInt();
	    while(true)
	    {
	         n=n+reverse(n);
	        if(n==reverse(n))
	        {   System.out.print(n);
	            break;
	        }
	    }
	}
}
