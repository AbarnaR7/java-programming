/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a[]={7,1,5,3,6,4};
         int buy=0,sell=0,index=0;
         int i,j;
         
         for(i=0;i<a.length;i++)
         {    int count=0;
             for(j=0;j<a.length;j++)
             {
                 if(a[i]<a[j])
                 {
                     count++;
                 }
             }
             if(count==a.length-1)
             {
                 buy=a[i];
                 index=i;
             }
             
         }
             for(i=index+1;i<a.length;i++)
             {
                 for(j=i+1;j<a.length;j++)
                 {
                     if(a[i]>a[j])
                     {
                         sell=a[i];
                     }
                 }
             }
             System.out.println(buy+" "+sell);
             System.out.print("profit="+(sell-buy));
	}
}
