import java.util.*;
public class Main
{
	public static void main(String[] args) {
     int num=50;
     for(int i=2;i<=num;i++)
     {   
         if(prime(i)==true)
         {
             System.out.print(i+" ");
         }
     }
	}
     
     
      static boolean prime(int n)
      {  int count=0;
          for(int i=2;i<=n/2;i++)
          {
              if(n%i==0)
              count++;
          }
          if(count==0)
          {
              return true;
          }
          return false;
      }
}
