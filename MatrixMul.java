import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  //  Scanner s=new Scanner(System.in);
	  int a[][]={{1,2},{4,0}};
	  int b[][]={{1,0},{4,1}};
	  int c[][]=new int[a[a.length-1].length][b[b.length-1].length];
	  for(int i=0;i<a[a.length-1].length;i++)
{	      for(int j=0;j<b[b.length-1].length;j++)
	      {	    int mul=0;

	          for(int k=0;k<a[a.length-1].length;k++)
	          {
	          mul=mul+a[i][k]*b[k][j];
	          }
	          c[i][j]=mul;
	      }
	  }
	  System.out.println(Arrays.deepToString(c));
	}
}
