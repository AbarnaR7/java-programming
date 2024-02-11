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
System.out.print("enter non negative integer:");
int x=s.nextInt();
System.out.println("square root of "+x+" is "+sqrt(x));
}
public static int sqrt(int x)
{
    if(x==0||x==1)
    {
        return x;
    }
    else
    {
      int result=1,i=1;
      while(result<=x)
      {
          i++;
          result=i*i;
      }
      return i-1;
    }
    
}
}
