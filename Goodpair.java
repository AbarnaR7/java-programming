import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
int a[]={1,2,3,1,1,3};
int count=0;
for(int i=0;i<a.length;i++)
{
    for(int j=i+1;j<a.length;j++)
    {
        if(a[i]==a[j])
        count++;
    }
}
System.out.print(count);
}
}
