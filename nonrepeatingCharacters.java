import java.util.*;

public class Main
{
	public static void main(String[] args) {
  String s="abarna";
  char a[]=s.toCharArray();
  int i,j;
  for(i=0;i<a.length;i++)
  {   int flag=0;
      for(j=0;j<a.length;j++)
      {
          if((a[i]==a[j])&&(i!=j))
          {
              flag=1;
          }
      }
      if(flag==0)
      {
          System.out.print(a[i]);
      }
  }
	}
}
