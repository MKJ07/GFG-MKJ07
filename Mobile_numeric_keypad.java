/*Input 1: S = "GFG"
Output: 43334
Input 2: S = "HEY U"
Output: 4433999088 */
public class Mobile_numeric_keypad {
    public static void main(String[] args) {
        String s="HEY U";
        String[] str={"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        String s1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                s1+=0;
            }
            else{
                int k=s.charAt(i)-'A';
                s1+=str[k];
                
            }
        }
        System.out.println(s1);
    }
    
}
