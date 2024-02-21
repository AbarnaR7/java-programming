public class Main
{
	public static void main(String[] args) {
	    int n=199;
	    int sum=0,sum2=0,sum3=0,r;
	     while(n>0)
	     {
	         r=n%10;
	         sum=sum+r;
	         n=n/10;
	     }
	     while(sum>0)
	     {
	         r=sum%10;
	         sum2=sum2+r;
	         sum=sum/10;
	     }
	     if(sum2>9)
	     {
	         while(sum2>0)
	         {
	             r=sum2%10;
	             sum3=sum3+r;
	             sum2=sum2/10;
	         }
	     }
	     System.out.print(sum3);
	}
}
