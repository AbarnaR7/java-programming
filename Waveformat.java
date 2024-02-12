import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("enter total elements:");
		int n=s.nextInt();
		System.out.println("enter the elements:");
		int i,j,temp;
		int a[]=new int[10];
		int b[]=new int[10];
		for(i=0;i<n;i++)
		{
		   a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
		    for(j=i+1;j<n;j++)
		    {
		        if(a[j]>a[i])
		        {
		        temp=a[j];
		        a[j]=a[i];
		        a[i]=temp;
		    }
		}
		}
		i=0;
		while(i<n-1)
		{
		    temp=a[i];
		    a[i]=a[i+1];
		    a[i+1]=temp;
		    i+=2;
		}
		
				for(i=0;i<n;i++)
		{
		    System.out.print(a[i]+" ");
		}

	
	}
}
