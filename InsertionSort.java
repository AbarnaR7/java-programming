import java.util.*;
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
 int a[]={9,10,2,3,8,6,5,7,4,1};

 int i,j,temp;
for(i=1;i<a.length;i++)
{
    temp=a[i];
    j=i-1;
    while(j>=0&&temp<=a[j])
    {
        a[j+1]=a[j];
        j=j-1;
}
a[j+1]=temp;
}
System.out.print(Arrays.toString(a));
}
}
