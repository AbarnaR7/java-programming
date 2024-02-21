import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a[]={9};
        	  int j=a.length-1;
	  int temp[]=new int[a.length+1];
	 int sum=1;
	 for(int i=0;i<a.length;i++)
	 {
	     sum=sum+a[i]*(int)Math.pow(10,j);
	     j--;
	 }
	 int i=0,r,count=0;
	 while(sum>0)
	 {
	     r=sum%10;
	     temp[i]=r;
	     sum=sum/10;
	     i++;
	     count++;
	 }
	 
	 int l=temp.length;
     if(count>a.length)
	 {
	 for(i=0;i<l/2;i++)
	 {
	     int k=temp[i];
	     temp[i]=temp[l-i-1];
	     temp[l-i-1]=k;
	 }
	  System.out.print(Arrays.toString(temp));

	 }
	 else if(count<=a.length)
	 {   l=temp.length-1;
	     for(i=0;i<l/2;i++)
	 {
	     int k=temp[i];
	     temp[i]=temp[l-i-1];
	     temp[l-i-1]=k;
	     
}
int newtemp[]=Arrays.copyOf(temp,temp.length-1);


  System.out.print(Arrays.toString(newtemp));


}

 	}
}
