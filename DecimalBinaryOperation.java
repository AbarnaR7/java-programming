import java.util.*;
public class Main
{
	public static void main(String[] args) {
   int a=5,r;
   ArrayList<Integer> b=new ArrayList<>();
      while(a>0)
      {
          r=a%2;
          b.add(r);
          a=a/2;
      } 
      if(a<8)
      b.add(0);

      Collections.reverse(b);
           System.out.println(b);

      for(int i=0;i<b.size();i++)
      {
          if(b.get(i)==0)
          b.set(i,1);
          else
          b.set(i,0);
      }
      
     System.out.println(b);
     int sum=0,count=0;
     for(int i=b.size()-1;i>=0;i--)
     {
        sum=sum+b.get(i)*(int)Math.pow(2,count);
        count++;
     }
          System.out.println(sum);

	}
}
