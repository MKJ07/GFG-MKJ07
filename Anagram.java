import java.util.*;
public class Anagram {
    public static boolean isAnagram(String a,String b)
    {
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        if(c1.length!=c2.length)
            return false;
        Arrays.sort(c1);
        Arrays.sort(c2);
        int c=0;
        for(int i=0;i<c1.length;i++){
            if(c1[i]==c2[i]){
                c++;
            }
            else
                break;
        }
        if(c==c1.length)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String s1="geeksforgeeks";
        String s2="forgeeksgeeks";
        if(isAnagram(s1, s2)){
            System.out.println("YES");
        }
        else{
            System.out.println("YES");
        }
        
    }
}
