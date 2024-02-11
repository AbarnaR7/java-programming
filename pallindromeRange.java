public class Main
{
	public static void main(String[] args) {
for(int i=1;i<=100;i++)
{
    if(isPallindrome(i)==1)
    {
        System.out.print(i+" ");
    }
}
}
public static int isPallindrome(int n)
{
    int rev=0,temp=n;
    while(temp>0)
    {   int r=temp%10;
        rev=(rev*10)+r;
        temp=temp/10;
    }
    if(n==rev)
  return 1;
  return 0;
}
}
