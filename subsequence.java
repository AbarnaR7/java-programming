
import java.util.*;
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
 String s1="ace";
 String s2="abcde";
char a[]=s1.toCharArray();
char b[]=s2.toCharArray();
char c[]=new char[a.length];
int i,j,k=0;
for(i=0;i<b.length;i++)
{
    for(j=0;j<a.length;j++)
    {
        if(b[i]==a[j])
        {
        c[k]=b[i];
        k++;
    }
}
}
if(Arrays.equals(a,c))
{
    System.out.println("subsequence");
}
else{
    System.out.println("not subsequence");
}
}
}
