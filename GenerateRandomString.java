import java.util.*;
class Main{
    public static void main(String[] args) {
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb=new StringBuilder();
        Random r= new Random();
        int length=5;
        for(int i=0;i<length;i++)
        {
            int j=r.nextInt(alphabet.length());
            sb.append(alphabet.charAt(j));
            
        }
        System.out.println(sb.toString());
    }
}
