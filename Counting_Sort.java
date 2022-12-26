import java.util.Arrays;

public class Counting_Sort {
    public static void main(String[] args) {
        String s="aefds";
        char[] c=new char[s.length()];
        for(int i=0;i<s.length();i++){
            c[i]=s.charAt(i);
            // if()
        }
        Arrays.sort(c);
        String s2="";
        for(int i=0;i<c.length;i++){
            s2+=c[i];

        }
        System.out.println(s2);
    }
    
}
