import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   String str="abarna";
	   char s[]=str.toCharArray();
	   int n=s.length;
	   permutation(s,0,n);
   }
   static void permutation(char s[],int start,int end)
   {
       for(int i=start;i<end-1;i++)
       {
           for(int j=i+1;j<end;j++)
           {
               swap(s,i,j);
               permutation(s,i+1,end);
               swap(s,i,j);
           }

       }
                  System.out.println(s);

   }
   static char[] swap(char s[],int i,int j)
   {
       char temp=s[i];
       s[i]=s[j];
       s[j]=temp;
       return s;

}
}
