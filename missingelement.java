/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i;
	    Scanner s=new Scanner(System.in);
		System.out.println("enter range");
		int n=s.nextInt();
		int a[]=new int[9];
		System.out.println("enter elements");
		for(i=0;i<n-1;i++)
		{
		a[i]=s.nextInt();
}
     Arrays.sort(a);
     int count=1;
     for(i=0;i<n-1;i++)
     {
         if(a[i]!=count)
         {
             break;
     }
     count++;
		
	}
	System.out.println("missing element is "+count);
}
}
