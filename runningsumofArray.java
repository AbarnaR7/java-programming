import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
int a[]={3,1,5,10,8,1};
int b[]=new int[a.length];
int sum=0;
for(int i=0;i<a.length;i++)
{
sum=sum+a[i]; 
b[i]=sum;
}
System.out.print(Arrays.toString(b));
}
}
