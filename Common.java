import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int A[]={3,3,3};
	    int B[]={3,3,3};
	    int C[]={3,3,3};
	    int n1=3,n2=3,n3=3;
     Set <Integer> d=new HashSet<>();
	    
	            ArrayList <Integer> list=new ArrayList<>();
	   
    for(int i=0;i<n1;i++)
    {
        for(int j=0;j<n2;j++)
        {
            if(A[i]==B[j])
            d.add(A[i]);
        }
    }
    for(int i=0;i<n3;i++)
    {
        if(d.contains(C[i])&&!(list.contains(C[i])))
        list.add(C[i]);
    }

    Collections.sort(list);
    if(list.size()==0)
    list.add(-1);
   System.out.println(list);
	}
}
