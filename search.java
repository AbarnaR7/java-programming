import java.util.*;
public class Main
{
    	public static void main(String[] args) {
 int a[]={10,20,30,40,50,60,70,80,90,100};
 Scanner s=new Scanner(System.in);
 System.out.println("enter search element");
 int search=s.nextInt();
 int count=0,index=0,i;
 for(i=0;i<a.length;i++)
 {
     if(a[i]==search)
     { 
         index=i;
         count++;
         }
    
 }

 System.out.println("index of "+search+" is "+index);

	}
}
