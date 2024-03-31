import java.util.LinkedList;
import java.util.Queue;

/*Question: Closest Neighbour in BST.
Link: https://www.geeksforgeeks.org/problems/closest-neighbor-in-bst/1

Example 1 :
Input : 
n = 24
Output : 
21
Explanation : The greatest element in the tree which 
              is less than or equal to 24, is 21. 
              (Searching will be like 5->12->21)

Example 2 :
Input : 
n = 4
Output : 
3
Explanation : The greatest element in the tree which 
              is less than or equal to 4, is 3. 
              (Searching will be like 5->2->3)
*/
class Node {
    int key;
    Node left;
    Node right;

    Node(int key) {
        this.key = key;
        left = null;
        right = null;
    }
}

public class ClosestNeighbourinBST {
    public static int findMaxForN(Node root, int n) {
        /*This approach has TC: O(n) {n is the number of nodes in the binary tree} and SC: O(n) {Using BFS} */
        if (root == null) {
            return -1;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int element = -1;
        while (!q.isEmpty()) {
            Node t = q.poll();
            if (t.key <= n && t.key >= element) {
                element = t.key;
            }
            if (t.left != null) {
                q.add(t.left);
            }
            if (t.right != null) {
                q.add(t.right);
            }
        }
        return element;
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);

        int n = 4;
        int maxElement = findMaxForN(root, n);
        System.out.println("Maximum element less than or equal to " + n + ": " + maxElement);
    }
}
