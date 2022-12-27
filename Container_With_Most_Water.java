/*Code Link:-https://practice.geeksforgeeks.org/problems/container-with-most-water0535/1
Input: N = 4
a[] = {1,5,4,3}
Output: 6
Explanation: 5 and 3 are distance 2 apart.
So the size of the base = 2. Height of
container = min(5, 3) = 3. So total area
= 3 * 2 = 6.
Input: N = 5
a[] = {3,1,2,4,5}
Output: 12
*/
public class Container_With_Most_Water {
    long maxArea(int A[], int len){
        long ans=0;
        int i=0,j=len-1;
        while(i<j){
            ans=Math.max(ans,Math.min(A[i],A[j])*(j-i));
            if(A[i]<A[j])
                i++;
            else
                j--;
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int N = 4;
        int a[] = {1,5,4,3};
        Container_With_Most_Water t=new Container_With_Most_Water();
        System.out.println(t.maxArea(a, N));
    }
}
