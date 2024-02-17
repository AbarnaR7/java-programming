import java.util.*;
public class Main
{
	public static void main(String[] args) {
   int n=5,i,j;
   for(i=0;i<=n;i++)
   {
       for(j=0;j<=n-i;j++)
       {
           System.out.print(" ");
       }
       for(j=0;j<=i;j++)
       {
           System.out.print(" "+formula(i,j));
       }
       System.out.println();
   }
	}
   static int formula(int n,int r)
   {
      return fact(n)/(fact(n-r)*fact(r));
   }
   static int fact(int n)
   {   int fact=1;
       for(int i=1;i<=n;i++)
       {
           fact=fact*i;
       }
       return fact;
   }
	}
