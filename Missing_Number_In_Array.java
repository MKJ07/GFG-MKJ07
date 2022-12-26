import java.util.ArrayList;
import java.util.Arrays;

public class Missing_Number_In_Array {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        int[] a={6,1,2,8,3,4,7,10,5};
        Arrays.sort(a);
        int n=a.length;
        for(int i=1;i<=n+1;i++){
            a1.add(i);
            // System.out.println(a1);

        }
        int s=0;
        for(int i=0;i<n;i++){
            if(a1.contains(a[i])){
                s=a1.get(i);
                System.out.print(s+" ");
            }
        }

    }
    
}
