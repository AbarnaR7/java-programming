import java.util.*;
public class Main
{   
    	public static void main(String[] args) {
int n=48,r;
     int temp=n,sum=0;
    while(n>0)
    {
        r=n%10;
        sum=sum+r;
        n=n/10;
    }
    if(temp%sum==0)
	 System.out.println("Harshad number");
	 else
	 System.out.println("not Harshad number");
	}
}
