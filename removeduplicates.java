public class Main
{
	public static void main(String[] args) {
	    int a[]={1,1,1,2,2,3,3,4};
	    int i,j=1;
	    for(i=0;i<a.length-1;i++)
	    {
	        if(a[i]!=a[i+1])
	        {
	            a[j++]=a[i+1];
	        }
	    }
	    for(i=0;i<j;i++)
	    {
	        System.out.print(a[i]);
	    }
	}
}
