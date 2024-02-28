import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int decimal=257,r,k=0,count=0;
	    int a[]=new int[20];
	    while(decimal>0)
	    {
	        r=decimal%2;
	        a[k++]=r;
	        decimal=decimal/2;
	        count++;
	        
	    }
	    for(int i=count-1;i>=0;i--)
	    {
	        System.out.print(a[i]);
	    }
	}
}
