import java.util.ArrayList;

public class FindTheClosestPairFromTwoArray {
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        int diff = Integer.MAX_VALUE;
        int res_l = 0, res_r = 0;
    int l = 0, r = m - 1;
    
    while (l < n && r >= 0) {
        int currentSum = arr[l] + brr[r];
        if (Math.abs(currentSum - x) < diff) {
            res_l = l;
            res_r = r;
            diff = Math.abs(currentSum - x);
        }
        if (currentSum < x) {
            l++;
        } else { 
            r--;
        }
    }
    
    ArrayList<Integer> result = new ArrayList<>();
    result.add(arr[res_l]);
    result.add(brr[res_r]);
    return result;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 7 };
        int brr[] = { 10, 20, 30, 40 };
        int x = 38;

        ArrayList<Integer> closestPair = printClosest(arr, brr, arr.length, brr.length, x);

        System.out.println(closestPair.get(0)+" "+closestPair.get(1));
    }
    
}