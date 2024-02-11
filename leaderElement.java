import java.util.*;
public class Main
{
	public static void main(String[] args) {
  int a[]={1,2,3,4,5,2};
  int i,j;
  for(i=0;i<a.length;i++)
  {  
      for(j=i+1;j<a.length;j++)
      {
      if(a[i]<=a[j])
      {
          break;
      }
      }
      if(j==a.length)
      {
          System.out.print(a[i]+" ");
      }

      }
  }
	}
 
