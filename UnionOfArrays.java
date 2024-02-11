import java.util.*;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    int i;
   ArrayList <Integer> a=new ArrayList <>();
      ArrayList <Integer> b=new ArrayList <>();
         ArrayList <Integer> c=new ArrayList <>();
         a.add(1);
         a.add(3);
         a.add(6);
         a.add(7);
         a.add(8);
         a.add(9);
         b.add(2);
         b.add(4);
         b.add(6);
         b.add(8);
        b.add(10);
        for(i=0;i<a.size();i++)
        {
            if(!c.contains(a.get(i)))
            {
                c.add(a.get(i));
            }
        }
                for(i=0;i<b.size();i++)
        {
            if(!c.contains(b.get(i)))
            {
                c.add(b.get(i));
            }
        }
        
        Collections.sort(c);
        for(i=0;i<c.size();i++)
        {
            System.out.print(c.get(i)+" ");
        }
	}
}
