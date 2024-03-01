import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	        System.out.println(power(-1));
	    }
	    static boolean power(int n)
	    {
		for(int i=0;i<=31;i++)
		{
		int result=(int)Math.pow(3,i);
		if(result==n&&(n<=(int)Math.pow(3,31)-1))
		{
		return true;
		}
	}
		return false;

}
}
