import java.util.*;
public class Main
{
	public static void main(String[] args) { 
	    int a=10;
	    int b=20;
	    int sum=add(a,b);
	    System.out.println(sum);
	}
	static int add(int a,int b)
	{   int carry;
	    while(b!=0)
	    {
	        carry=a&b;
	        a=a^b;
	        b=carry<<1;
	    }
	    return a;
	}
}
