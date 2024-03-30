import java.util.LinkedList;
import java.util.Queue;
/*Question: Minimum element in BST.
Link: https://www.geeksforgeeks.org/problems/minimum-element-in-bst/1

Example 1:
Input:
           5
         /    \
        4      6
       /        \
      3          7
     /
    1
Output: 1

Example 2:
Input:
             9
              \
               10
                \
                 11
Output: 9
*/

class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class MinimumelementinBST {
    /*This approach has TC: O(n) and SC:O(n) {n: no of nodes in a tree} */
    int minValue(Node root) {
        if (root == null)
            return -1;
        int min = Integer.MAX_VALUE;
        Queue<Node> temp = new LinkedList<>();
        temp.add(root);
        while (!temp.isEmpty()) {
            Node t = temp.poll();
            min = Math.min(min, t.data);
            if (t.left != null) {
                temp.add(t.left);
            }
            if (t.right != null) {
                temp.add(t.right);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // Creating a sample Binary Search Tree (BST)
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);
        MinimumelementinBST obj = new MinimumelementinBST();
        int min = obj.minValue(root);
        System.out.println("Minimum value in the BST: " + min);
    }
}
