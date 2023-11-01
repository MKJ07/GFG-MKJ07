/*Question: Frequencies of Limited Range Array Elements.
Link: https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1

Input:
N = 5
arr[] = {2, 3, 2, 3, 5}
P = 5
Output:
0 2 2 0 1
Explanation: 
Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 2 times.
3 occurring 2 times.
4 occurring 0 times.
5 occurring 1 time.
 */
public class FrequenciesofLimitedRangeArrayElements {
    public static void frequencyCount(int arr[], int N, int P)
    {
        /*This is the brute force approach having TC: O(2N) and SC: O(max(P,N)+1) */
        int size=Math.max(P,N);
        int [] temp=new int[size+1];
        for(int i=0;i<N;i++){
            temp[arr[i]]++;
        }
        for(int i=0;i<N;i++){
            arr[i]=temp[i+1];
        }
    }
    public static void main(String[] args) {
        int N = 5,P=5;
        int arr[] = {2, 3, 2, 3, 5};
        frequencyCount(arr, N, P);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
