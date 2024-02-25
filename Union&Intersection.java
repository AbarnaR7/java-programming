import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a[]={1,3,6,7,8,9};
	    int b[]={2,3,4,6,8,10};
	    int c[]=new int[a.length+b.length];
	    int k=0,count=0;
	    for(int i=0;i<a.length;i++)
	    {
	        c[k++]=a[i];
	       
	    }
	    
	    for(int i=0;i<b.length;i++)
	    {  int flag=0;
	        for(int j=0;j<a.length;j++)
	        {
	            if(b[i]==a[j])
	            { flag=1;
	            }
	        }
	        if(flag==0)
	        {
	            c[k++]=b[i];
	        }
	    }
	    Arrays.sort(c);

	    System.out.print("union of 2 arrays:");
	    for(int i=c.length-k;i<c.length;i++)
	    {
	        System.out.print(c[i]+" ");
	    }
	   System.out.print("intersection of 2 arrays:");
	   for(int i=0;i<a.length;i++)
	   {
	       for(int j=0;j<b.length;j++)
	       {
	           if(a[i]==b[j])
	           {
	               System.out.print(a[i]+" ");
	           }
	       }
	   }

	}
}
