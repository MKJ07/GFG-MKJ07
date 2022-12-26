public class Permutations_in_array {
    public boolean isPossible(long a[], long b[], int n, long k){
        for(int i=0;i<a.length;i++){
            if((a[i]+b[i])>=k){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        long a[] = {1, 2, 2, 1}, b[] = { 3, 3, 3, 4 }, k = 5;
        Permutations_in_array t=new Permutations_in_array();
        System.out.println(t.isPossible(a, b,a.length, k));


        
    }
    
}
