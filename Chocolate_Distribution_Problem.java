import java.util.*;
/*N = 8, 
A = {3, 4, 1, 9, 56, 7, 9, 12}
M = 5
Output: 6 */
public class Chocolate_Distribution_Problem {
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int min=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int d=a.get(i+m-1)-a.get(i);
            if(d<min){
                min=d;
            }
            
        }
       return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr.add(x);

        }
        int m=sc.nextInt();
        Chocolate_Distribution_Problem t=new Chocolate_Distribution_Problem();
        System.out.println(t.findMinDiff(arr, n, m));
        sc.close();
    }
}
