import java.util.*;
/*Question: Balloon EveryWhere.
Link:-https://practice.geeksforgeeks.org/problems/45fa306a9116332ece4cecdaedf50f140bd252d4/1

Input: S: nlaebolko
Output: 1
Explanation: Here, the number of occurence of 'b' = 1 of occurence of 'a' = 1 of occurence of 'l' = 2
of occurence of 'o' = 2 of occurence of 'n' = 1 So, we can form 1 "balloon" using the letters.

Input: S: loonbalxballpoon
Output: 2
Explanation: Here, the number of occurence of 'b' = 2 of occurence of 'a' = 2 of occurence of 'l' = 4
of occurence of 'o' = 4 of occurence of 'n' = 2 So, we can form 2 "balloon" using the letters.
*/
public class Balloon_Everywhere {
    public int maxInstance(String s) {
        // Code here
        HashMap<Character,Integer> h1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(h1.containsKey(s.charAt(i))){
                h1.put(s.charAt(i),h1.get(s.charAt(i))+1);
            }
            else{
                h1.put(s.charAt(i),1);
            }
        }
        int min=Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> it: h1.entrySet())
        {
            
            if(it.getKey()=='b'){
                int d=it.getValue()/1;
                if(d<min){
                    min=d;
                }
            }
            else if(it.getKey()=='a'){
                int d=it.getValue()/1;
                if(d<min){
                    min=d;
                }
            }
            else if(it.getKey()=='l'){
                int d=it.getValue()/2;
                if(d<min){
                    min=d;
                }
            }
            else if(it.getKey()=='o'){
                int d=it.getValue()/2;
                if(d<min){
                    min=d;
                }
            }
            else if(it.getKey()=='n'){
                int d=it.getValue()/1;
                if(d<min){
                    min=d;
                }
            }
            
            // System.out.println(it.getKey() + "   " + it.getValue());
        }
        
        return min;
    }
	public static void main(String[] args) {
	    String s="nlaebolko";
	    Balloon_Everywhere t=new Balloon_Everywhere();
		System.out.println(t.maxInstance(s));
	}
}
