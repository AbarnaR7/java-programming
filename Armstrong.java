import java.util.*;
import java.lang.Math.*;

public class Main
{
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int n=s.nextInt();
int temp=n,r,sum=0;
int power=n,count=0;
while(power>0)
{
    power=power/10;
    count++;
}

while(n>0)
{
    r=n%10;
    sum=sum+(int)Math.pow(r,count);
    n=n/10;
}
if(sum==temp)
{
    System.out.print("Armstrong");
}
else{
    System.out.println("not armstrong");
}
}
}
