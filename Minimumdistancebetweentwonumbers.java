public class Minimumdistancebetweentwonumbers {
    static int minDist(int a[], int n, int x, int y) {
        /*This is the optimal approach having TC: O(n) and SC: O(1) */
        int minDistance = Integer.MAX_VALUE; // Initialize minDistance to a large value
        int lastSeen = -1; // Initialize lastSeen to -1, indicating neither 'x' nor 'y' has been seen yet

        for (int i = 0; i < n; i++) {
            if (a[i] == x || a[i] == y) { // If the current element is 'x' or 'y'
                if (lastSeen != -1 && a[i] != a[lastSeen]) { // If 'x' or 'y' has been seen before, and the current
                                                             // element is different
                    int distance = i - lastSeen; // Calculate the distance between the current index and the last seen
                                                 // index
                    minDistance = Math.min(minDistance, distance); // Update minDistance with the minimum distance
                }
                lastSeen = i; // Update lastSeen to the current index
            }
        }

        if (minDistance == Integer.MAX_VALUE) {
            return -1; // Either 'x' or 'y' was not found in the array
        }

        return minDistance; // Return the minimum index-based distance between 'x' and 'y'
        /*
         * This is the brute force approach having TC: O(n^2) and SC: O(1)
         * int minN=Integer.MAX_VALUE;
         * int c=0;
         * for(int i=0;i<n;i++){
         * for(int j=0;j<n;j++){
         * if(a[i]==x && a[j]==y){
         * int diff=0;
         * if(i>j)
         * diff=i-j;
         * else
         * diff=j-i;
         * minN=Math.min(minN,diff);
         * c=1;
         * }
         * }
         * }
         * if(c==0){
         * return -1;
         * }
         * return minN;
         */
    }

    public static void main(String[] args) {
        int N = 7;
        int A[] = { 86, 39, 90, 67, 84, 66, 62 };
        int x = 42, y = 12;
        System.out.println(minDist(A, N, x, y));
    }
}
