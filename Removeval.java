import java.util.*;
import java.util.Arrays;
class Main {
    public static void main(String[] args)
    {
  int a[]={3,2,2,3};
  int val=3;
  int k=0,j=0;
  int temp[]=new int[a.length];
  for(int i=0;i<a.length;i++)
  {  int count=0;
      if(a[i]==val)
      {
         count++; 
      }
      if(count==0)
      {
          temp[j]=a[i];
          j++;
          k++;
      }
  }
  
  System.out.println(k);
  System.out.print(Arrays.toString(temp));
    }
}
