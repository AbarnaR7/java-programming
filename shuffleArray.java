import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
int a[]={2,5,1,3,4,7};
int n=3;
int b[]=new int[a.length];
int j=0;int k=1;
for(int i=0;i<a.length/2;i++)
{
    b[j]=a[i];
    j+=2;
}
for(int i=a.length/2;i<a.length;i++)
{
    b[k]=a[i];
    k+=2;
}
System.out.println(Arrays.toString(b));
}
    
}

