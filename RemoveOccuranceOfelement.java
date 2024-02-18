import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a[]={3,2,2,3};
	    int temp[]=new int[a.length];
	    int val=3;
	    int i,j,k=0;
	    for(i=0;i<a.length;i++)
	    {
	        if(a[i]!=val)
	        {
	            temp[k++]=a[i];
	        }
	        
	    }
	      for(i=0;i<k;i++)
	      {
	          a[i]=temp[i];
	      }
	      for(i=0;i<k;i++)
	      {
	          System.out.print(a[i]);
	      }
}
}
