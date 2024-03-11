import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String str="1ab787c23";
	    ArrayList <String> a=new ArrayList<>();
	            for(int i=0;i<str.length();i++)
        {   int j=i,count=0;
            if(Character.isDigit(str.charAt(i)))
            {
                while(Character.isDigit(str.charAt(i)))
                {    count++;
                       i++;
                    if(i==str.length())
                    break;
                }
                if(j+count<=str.length())
                {
                    a.add(str.substring(j,j+count));
                }
            }
        }
        ArrayList <Integer> b=new ArrayList<>();
        for(int i=0;i<a.size();i++)
        {
            b.add(Integer.parseInt(a.get(i)));
        }
        int sum=0;
        for(int i=0;i<b.size();i++)
        {
            sum=sum+b.get(i);
        }
     System.out.println(sum);
	}
}
