import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int i,count=0;
 String a[]={"apple","mango","grapes","apple","orange","apple"};
 for(i=0;i<a.length;i++)
 {
     if(a[i]=="apple")
    count++;
 }
 System.out.println("count="+count);
	}
}
