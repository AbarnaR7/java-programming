/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
   int a=50,r;
   ArrayList<Integer> b=new ArrayList<>();
      while(a>0)
      {
          r=a%2;
          b.add(r);
          a=a/2;
      }
     int ans[]=new int[b.size()];
     int k=0;
     for(int i=b.size()-1;i>=0;i--)
     {
         if(b.get(i)==0)
         ans[k]=1;
         else
         ans[k]=0;
         k++;
     }
     System.out.println(Arrays.toString(ans));
     int sum=0,count=0;
     for(int i=ans.length-1;i>=0;i--)
     {
        sum=sum+ans[i]*(int)Math.pow(2,count);
        count++;
     }
          System.out.println(sum);

	}
}
