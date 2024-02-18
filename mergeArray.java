import java.util.*;
import java.util.Arrays;
class Main {
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    System.out.println("enter m");
    int m=s.nextInt();
        System.out.println("enter n");

    int n=s.nextInt();
int nums1[]=new int[m+n];
int nums2[]=new int[n];
    System.out.println("enter elements in nums1");

for(int i=0;i<m;i++)
{
    nums1[i]=s.nextInt();
}
    System.out.println("enter elements in nums2");

for(int j=0;j<n;j++)
{
    nums2[j]=s.nextInt();
}
int j=0;
for(int i=m;i<nums1.length;i++)
{
    nums1[i]=nums2[j];
    j++;
    
}
Arrays.sort(nums1);
System.out.print(Arrays.toString(nums1));
}
}
