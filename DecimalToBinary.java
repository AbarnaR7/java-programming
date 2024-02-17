import java.util.*;
public class Main
{
	public static void main(String[] args) { 
Scanner s=new Scanner(System.in);
System.out.print("enter decimal number:");
int n=s.nextInt();
Binary(n);
}
static void Binary(int n)
{
    int temp[]=new int[20];
    int j=0;
    while(n!=0)
    {
        temp[j]=n%2;
        n=n/2;
        j++;
    }
    for(int i=temp.length-1;i>=0;i--)
{
    System.out.print(temp[i]);
}
}
}
