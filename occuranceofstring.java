import java.util.*;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
  ArrayList <String> list=new ArrayList<>();
  int i,count=0;
  list.add("Apple");
    list.add("Mango");
    list.add("Apple");
      list.add("Apple");
        list.add("grapes");
          list.add("Apple");
        System.out.println(list);
        for(i=0;i<list.size();i++)
        {
            if(list.get(i)=="Apple")
            {
                count++;
            }
        }
        System.out.println("occurance="+count);
	}
	
}
