import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int i,j;
		for(i=0;i<3;i++)
		{
		    for(j=2;j>=0;j--)
		    {
		
		System.out.print(a[j][i]+" ");
		    }
		    System.out.println();
	}
}
}
