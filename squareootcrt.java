import java.util.*;
public class Main
{
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("enter non negative integer:");
int x=s.nextInt();
System.out.println("square root of "+x+" is "+sqrt(x));
}
public static double sqrt(int x)
{
double temp;
double squareroot=x/2;
do{
    temp=squareroot;
    squareroot=(temp+(x/temp))/2;
}
while((temp-squareroot)!=0);
return squareroot;
}
}
