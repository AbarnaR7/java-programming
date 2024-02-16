/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.lang.String;
public class Main
{
    public static int BinarySearch(int a[],int beg,int end,int val)
	{
	    int mid;
	    if(end>=beg)
	    {
	        mid=(beg+end)/2;
	   
	    if(a[mid]==val)
	    {
	        return mid+1;
	    }
	    	 else if(a[mid]<val)
	        {
	            return BinarySearch(a,mid+1,end,val);
	        }

	    
	    else if(a[mid]>val)
	    {
	        return BinarySearch(a,beg,mid-1,val);
	        
	        }
	    }
	        return -1;
	    }
	
	public static void main(String[] args) {

   int a[]={3,2,7,9,5,1,6,8};
   Arrays.sort(a);
   int n=a.length-1;
   int val=2;
   System.out.println(Arrays.toString(a));
   int res=BinarySearch(a,0,n,val);
   if(res==-1)
   {
       System.out.println("element not found");
   }
   else
   {
              System.out.print(val+" is found in position "+res);
   }
	}
}
