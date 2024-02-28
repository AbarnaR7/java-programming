import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   int a[]={9,14,3,2,43,11,58,22};
	   for(int i=0;i<a.length-1;i++)
	   {
	       int index=i;
	       for(int j=i+1;j<a.length;j++)
	       {
	           if(a[j]<a[index])
	           index=j;
	       }
	       int small=a[index];
	       a[index]=a[i];
	       a[i]=small;
	}
	System.out.println(Arrays.toString(a));
}
}
