import java.util.*;
public class Common_elements {
    public static void main(String[] args) {
        int A[]={1, 5, 10, 20, 40, 80};
        int B[]={6, 7, 20, 80, 100};
        int C[]={3, 4, 15, 20, 30, 70, 80, 120};
        int n1=A.length, n2=B.length, n3=C.length;
        int i=0,j=0,k=0;
        ArrayList<Integer> a1=new ArrayList<>();
        while(i<n1 && j<n2 && k<n3){
            if(A[i] == B[j] && B[j] == C[k]){
                if(a1.contains(A[i])){
                    i++;
                    j++;
                    k++;
                }
                else
                    a1.add(A[i]);
                    i++;
                    j++;
                    k++;
                
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
        for(int s:a1){
            System.out.print(s+" ");

        }
    }
    
}
