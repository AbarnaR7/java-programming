import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  int a[]={1,2,4,5,6,3};
	  int b[]=new int[a.length];
	    Arrays.sort(a);
	    int i,j=0,k=1;
	   for(i=0;i<a.length/2;i++)
	    {
	       b[k]=a[i];
	       k=k+2;
	    }

	    for(i=a.length-1;i>=a.length/2;i--)
	    {
	       b[j]=a[i];
	       j=j+2;
	    }

	    System.out.println(Arrays.toString(b));
	}
}
