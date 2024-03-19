/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
  int a[] = {-7,1,5,2,-4,3,0};
  int n=a.length;
  int i=1;
  while(i<n-1)
  {
      int sum1=0,sum2=0;
  for(int j=0;j<i;j++)
  {
    sum1=sum1+a[j];
  }
  for(int j=i+1;j<n;j++)
  {
      sum2=sum2+a[j];
  }
  if(sum1==sum2)
  {
  System.out.println(i);
  break;
  }
  i++;
  
  }
 
	}
}
