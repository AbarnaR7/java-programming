/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int n=1111111;
	   System.out.print(find(n));
	    
	}
static int find(int n)
{  int r,sum=0;
   while(n>0)
   {
       r=n%10;
       sum=sum+r*r;
       n=n/10;
   }
   if(sum>5)
   {
       return find(sum);
   }
   else
   return sum;
}
}
