import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int binary=101100001;
	    int decimal=0,n=0,r;
	    while(binary>0)
	    {
	       r=binary%10;
	       decimal=decimal+r*(int)Math.pow(2,n);
	       binary=binary/10;
	       n++;
	    }
	    System.out.print(decimal);
	}
}
