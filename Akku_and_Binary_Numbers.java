/*Code Link:-https://practice.geeksforgeeks.org/problems/akku-and-binary-numbers0902/1
Input:
L = 11 and R = 19 
Output: 4
Explanation:
There are 4 such numbers with 3 set bits in 
range 11 to 19.
11 -> 1011
13 -> 1101
14 -> 1110
19 -> 10011
Input:
L = 25 and R = 29
Output: 3
 */
public class Akku_and_Binary_Numbers {
    long solve(long L, long R){
        int ct=0;
        for(int i=0;i<65;i++){
            for(int j=i+1;j<65;j++){
                for(int k=j+1;k<65;k++){
                    double trex=Math.pow(2,i)+Math.pow(2,j)+Math.pow(2,k);
                    if(trex>=L && trex<=R){
                        ct++;
                    }
                }
            }
        }
        return ct;
    }
    /*This is another approach but in this edge will not satisfied. It gives negativesArraysize Exception
     As array cannot store such a long value 10^18 */

        // int l=(int)(R-L)+1;
        // String[] arr=new String[l];
        // int c=0;
        // for(long i=L;i<=R;i++){
        //     arr[c]=Long.toBinaryString(i);
        //     c++;  
        // }
        // long ct=0;
        // for(int k=0;k<arr.length;k++){
        //     int c1=0;
        //     for(int i=0;i<arr[k].length();i++){
        //         if(arr[k].charAt(i)=='1')
        //             c1+=1;
        //     }
        //     if(c1==3)
        //         ct+=1; 
        // }
        // return ct;
    public static void main(String[] args) {
        int L=11,R=19;
        Akku_and_Binary_Numbers t=new Akku_and_Binary_Numbers();
        System.out.println(t.solve(L, R));
    }
}