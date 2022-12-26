<<<<<<< HEAD
import java.util.*;
/*Code Link:-https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1?page=1&curated[]=1&sortBy=submissions
 Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9
 */
public class Check_if_two_arrays_are_equal_or_not {
    public static boolean check(long A[],long B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int c=0;
        for(int i=0;i<N;i++){
            if(A[i]==B[i])
                c++;
        }
        if(c==N)
            return true;
        else
            return false;
        // ArrayList<Long> a1=new ArrayList<>();
        // for(int i=0;i<N;i++){
        //     a1.add(A[i]);   
        // }
        // int c=0;
        // for(int i=0;i<N;i++){
        //     if(a1.contains(B[i])){
        //         c++;
        //     }
        // }
        // if(c==N)
        //     return true;
        // else
        //     return false;
    }
    public static void main(String[] args) {
        int N = 5;
        long A[] = {1,2,5,4,0};
        long B[] = {2,4,5,0,1};
        System.out.println(check(A, B, N));
    }
}
=======
import java.util.*;
/*Code Link:-https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1?page=1&curated[]=1&sortBy=submissions
 Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9
 */
public class Check_if_two_arrays_are_equal_or_not {
    public static boolean check(long A[],long B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int c=0;
        for(int i=0;i<N;i++){
            if(A[i]==B[i])
                c++;
        }
        if(c==N)
            return true;
        else
            return false;
        // ArrayList<Long> a1=new ArrayList<>();
        // for(int i=0;i<N;i++){
        //     a1.add(A[i]);   
        // }
        // int c=0;
        // for(int i=0;i<N;i++){
        //     if(a1.contains(B[i])){
        //         c++;
        //     }
        // }
        // if(c==N)
        //     return true;
        // else
        //     return false;
    }
    public static void main(String[] args) {
        int N = 5;
        long A[] = {1,2,5,4,0};
        long B[] = {2,4,5,0,1};
        System.out.println(check(A, B, N));
    }
}
>>>>>>> f9abe57b19133f660331820207ada1e8912064e2
