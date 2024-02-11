/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
int a[]={10,9,15,11,16};
int n=a.length;
System.out.println("peak element is "+peak(a,n));
}
public static int peak(int a[],int n)
{   
    int i;

for(i=1;i<n-1;i++)
{
if((a[i]>=a[i-1])&&(a[i]>=a[i+1]))
    
        return i;
}
    if(n==1)
    
        return n;

    if((a[0]>a[1])&&(a[0]>a[n-1]))
    
        return 0;

    if(a[n-1]>a[n-2])

    return n-1;

return 0;
}
}
