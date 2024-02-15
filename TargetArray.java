import java.util.*;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		ArrayList <Integer> num=new ArrayList <>();
		ArrayList <Integer> index=new ArrayList <>();
		ArrayList <Integer> target=new ArrayList <>();
		num.add(0);
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		index.add(0);
		index.add(1);
		index.add(2);
		index.add(2);
		index.add(1);
      for(int i=0;i<num.size();i++)
      {
        target.add(index.get(i),num.get(i));
      }
            for(int i=0;i<target.size();i++)
      {
          System.out.print(target.get(i));
      }

	}
}
