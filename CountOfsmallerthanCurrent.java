import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
int a[]={8,1,2,2,3};

int b[]=new int[a.length];
int k=0;
for(int i=0;i<a.length;i++)
{    int count=0;
    for(int j=0;j<a.length;j++)
    {
        if(a[i]>a[j]&&i!=j)
        {
            count++;
        }
    }
    b[k]=count;
    k++;
}
System.out.println(Arrays.toString(b));
}
}
