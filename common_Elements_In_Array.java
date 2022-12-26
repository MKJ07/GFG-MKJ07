import java.util.ArrayList;
/*input 1: n1 = 6; A = {1, 5, 10, 20, 40, 80}
           n2 = 5; B = {6, 7, 20, 80, 100}
       ]   n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120} */
public class common_Elements_In_Array {
    
    ArrayList<Integer> longestCommonPrefix(int A[], int B[], int C[],int n1, int n2, int n3) {
        int i=0,j=0,k=0;
        ArrayList<Integer> a1=new ArrayList<>();
        while(i<n1 && j<n2 && k<n3){
            if(A[i] == B[j] && B[j] == C[k]){
                if(a1.contains(A[i])){
                    i++;
                    j++;
                    k++;
                }else{
                    a1.add(A[i]);
                    i++;
                    j++;
                    k++;
                }
                
            }
            else if(A[i]<B[j]){
                i++;
            }
            else if(B[j]<C[k]){
                j++;
            }
            else{
                k++;
            }
        }
        return a1;
        
    }
    public static void main(String[] args) {
        common_Elements_In_Array t=new common_Elements_In_Array();
        int n1 = 3, A[] = {3,3,3};
        int n2 = 3, B[] = {3,3,3};
        int n3 = 3, C[] = {3,3,3};
        System.out.println(t.longestCommonPrefix(A, B, C, n1, n2, n3));
        
    }
    
}
