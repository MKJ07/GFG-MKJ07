import java.util.ArrayList;
import java.util.List;
/*Question: Print Pattern
Link: https://www.geeksforgeeks.org/problems/print-pattern3549/1

Input: 
N = 10
Output: 
10 5 0 5 10
Explaination: It follows the same logic as per the above example.
 */
public class PrintPattern {
    // static List<Integer> li=new ArrayList<>();
    // static int opminus(int num){
    //     li.add(num);
    //     if(num<0){
    //         return num; 
    //     }
    //     return opminus(num-5);
    // }
    // static int opplus(int num,int n){
    //     li.add(num);
    //     if(num>=n){
    //         return num; 
    //     }
    //     return opplus(num+5,n);
    // }
    // public List<Integer> pattern(int N){
    //     int res=opminus(N);
    //     res+=5;
    //     opplus(res,N);
    //     return li;
    // }
    
    public static ArrayList<Integer> prtNum(ArrayList<Integer> list,int n){
        list.add(n);
        if(n<=0){
            return list;
        }
        prtNum(list,n-5);
        list.add(n);
        return list;
    }
    static List<Integer> pattern(int N){
        ArrayList<Integer> list = new ArrayList<>();
        return prtNum(list,N);
    }

    public static void main(String[] args) {
        List<Integer> result = pattern(17);
        System.out.println(result);
    }
}
