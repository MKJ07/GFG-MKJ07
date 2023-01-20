/*Question:-Maximum Weight Node
Link:-https://practice.geeksforgeeks.org/problems/b64485d3994958cca8748991bb58668204b3e4c0/1
Input: N = 4 Edge[] = {2, 0, -1, 2}
Output: 2
Explanation: 1 -> 0 -> 2 <- 3 weight of 0th cell = 1
weight of 1st cell = 0 (because there is no cell pointing to the 1st cell)
weight of 2nd cell = 0+3 = 3
weight of 3rd cell = 0 There is only one cell which has maximum weight (i.e 2) So, cell 2 is the output.

Input: N = 1 Edge[] = {-1}
Output: 0
Explanation: weight of 0th cell is 0.There is only one cell so cell 0 has maximum weight.
*/
public class Maximum_Weight_Node {
    public int maxWeightCell(int N, int Edge[]){
        int[] wt=new int[N];
        for(int i=0;i<N;i++){
            if(Edge[i]!=-1){
                wt[Edge[i]]+=i;
            }
        }
        int max=0,m=0;
        for(int i=0;i<N;i++){
            if(wt[i]>=m){
                m=wt[i];
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int N = 4;
        int Edge[] = {2, 0, -1, 2};
        Maximum_Weight_Node t=new Maximum_Weight_Node();
        System.out.println(t.maxWeightCell(N, Edge));
    }
}
