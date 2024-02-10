/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    	public static void main(String[] args) {
 int a[]={1,3,4,3,3,5};
 int i,k=3;
 int first=-1,last=-1;
  for(i=0;i<a.length;i++)
  {
      if(a[i]==k)
      {  first=i;
          
          break;
      }
  }
  for(i=a.length-1;i>=0;i--)
  {
      if(a[i]==k)
      {
          last=i;
          break;
      }
  }
  System.out.println(first+" "+last);
	}
}
