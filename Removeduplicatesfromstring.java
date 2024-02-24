import  java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s="helloworld";
	    char a[]=s.toCharArray();
	    char temp[]=new char[a.length];
	    int k=0;
	    int count=0;
	    for(int i=0;i<a.length;i++)
	    {	    int flag=0;

	        for(int j=0;j<a.length;j++)
	        {
	        if(a[i]==a[j]&&(i!=j))
	        {
	            flag=1;
	            break;
	        }
	    }
	    if(flag==0)
	    {
	        temp[k++]=a[i];
	        count++;
	        
	    }
	}
  for(int i=0;i<count;i++)
  {
   System.out.print(temp[i]+" ");   
  }
}
}
