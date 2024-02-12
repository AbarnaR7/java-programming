/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("enter digit:");
	    int n=s.nextInt();
	    int i;
	    int result=0;
	    for(i=50;i<=100;i++)
	    {
	      result=result+count(i,n);
	    }
	    System.out.println(result);
}
public static int count(int i,int n)
{
  int r,count=0;

    while(i>0)
{
  r=i%10;
  if(r==n)
  {
      count++;
  }
  i=i/10;
}
return count;
}
}
