/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		String s="abarna";
		char a[]=s.toCharArray();
		int max=0;
		char maxvalue=0;
		int i,j;
		for(i=0;i<a.length;i++)
		{   int count=0;
		    for(j=0;j<a.length;j++)
		    {
		        if(a[i]==a[j])
		        count++;
		    }
		    if(count>max)
		    {
		        max=count;
		        maxvalue=a[i];
		    }
		}
				System.out.println("maximum count is:"+max);

		System.out.println("maximum occuring character is:"+maxvalue);

	}
}
