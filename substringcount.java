public class Main
{
	public static void main(String[] args) {
String text="abcabacababcaba";
String pattern="cab";
int count=0;
for(int i=0;i<text.length();i++)
{
    if(text.charAt(i)==pattern.charAt(0))
    {
        if(text.substring(i,pattern.length()+i).equals(pattern))
        {
            count++;
        }
    }
} 
System.out.println(count);
}
}
