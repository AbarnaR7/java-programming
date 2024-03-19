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

	    int a[]=new int[10];
	    a[0]=1;
	    a[1]=2;
	    a[2]=6;
	    a[3]=3;
	    a[4]=4;

	    int n=5; 
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(a[i]+" ");
	    }
	    System.out.println("enter element to be inserted");
	    int element=s.nextInt();
	    System.out.println("enter pos to be inserted");
	    int pos=s.nextInt();
	    for(int i=n-1;i>=pos;i--)
	    {
	        a[i+1]=a[i];
	    }
	    	        a[pos]=element;

	    	for(int i=0;i<=n;i++)
	    	{
	    	    System.out.print(a[i]+" ");
	    	}

	}
}
