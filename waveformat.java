import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a[]={1,2,3,4,5};
	    int n=a.length;
	    int temp[]=new int[n];
	    int j=0,k=1,i;
	    i=0;
	    if(n>1)
	    {
	    while(i<n)
	    {
	     temp[k]=a[i];
	     k+=2;
	     if(k==n)
	     break;
	     i+=2;
	    }
	  
	  i=1;
	    while(i<n)
	    {
	    temp[j]=a[i];
	    j+=2;
	    i+=2;
	    }
	    if(n%2!=0)
	    temp[n-1]=a[n-1];
	   for(i=0,j=0;i<n;i++,j++)
	   {
	       a[i]=temp[j];
	   }
	    }
	    System.out.println(Arrays.toString(a));
	}
	
	
}
