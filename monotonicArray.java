import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int a[]={9,8,6,5,4,2};
	    int increasing =0,decreasing=0;
	    for(int i=0;i<a.length-1;i++)
	    {
	        if(a[i]>a[i+1])
	        {
	            increasing=1;
	        }
	    }
	    	    for(int i=0;i<a.length-1;i++)
	    {
	        if(a[i]<a[i+1])
	        {
	          decreasing=1;
	        }
	    }
	    if(increasing==0||decreasing==0)
	    {
	        System.out.println("monotonic");
	    }
  else{
      System.out.println("not monotonic");
  }
	}
}

