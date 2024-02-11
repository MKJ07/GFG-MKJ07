import java.util.ArrayList;
/*Question: Recamans sequence.
Link: https://www.geeksforgeeks.org/problems/recamans-sequence4856/1

Input: 
n = 5
Output: 
0 1 3 6 2
Explaination: 
a(0) = 0,
a(1) = a(0)-1 = 0-1 = -1 and -1<0, therefore a(1) = a(0)+1 = 1,
a(2) = a(1)-2 = 1-2 = -1 and -1<0, therefore a(2) = a(1)+2 = 3,
a(3) = a(2)-3 = 3-3 = 0 but since 0 is already present in the sequence, a(3) = a(2)+3 = 3+3 = 6,
a(4) = a(3)-4 = 6-4 = 2.
Therefore the first 5 elements of Recaman's sequence will be 0 1 3 6 2.
*/
public class Recamanssequence {
    static ArrayList<Integer> recamanSequence(int n){
        /*This approach has TC: O(n) and SC: O(n) */
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(0);
        for(int i=1;i<n;i++){
            int res=a1.get(i-1)-i;
            if(a1.contains(res) || res<0){
                res=a1.get(i-1)+i;
            }
            a1.add(res);
        }
        return a1;
    }
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> sequence = recamanSequence(n);
        System.out.println("Recaman Sequence up to " + n + ": " + sequence);
    }
}
