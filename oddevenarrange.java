class Solution
{
    
    public void sortIt(long a[], long n)
    {
        ArrayList <Long> odd=new ArrayList<>();
        ArrayList <Long> even=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            even.add(a[i]);
            else
            odd.add(a[i]);
        }
                Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even);
        int count=0;
        for(int i=0;i<odd.size();i++)
        {
            a[i]=odd.get(i);
            count++;
        }
        for(int i=0;i<even.size();i++ )
        {
            a[count++]=even.get(i);
        }
        
   }
}
