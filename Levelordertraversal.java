import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*Question: Level order traversal.
Link: https://www.geeksforgeeks.org/problems/level-order-traversal/1

Example 1:
Input:
    1
  /   \ 
 3     2
Output:
1 3 2

Example 2:
Input:
        10
     /      \
    20       30
  /   \
 40   60
Output:
10 20 30 40 60
*/
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
public class Levelordertraversal {
    static ArrayList<Integer> levelOrder(Node root) {
        /*This is the optimal approach having TC: O(n) and SC: O(n) {n: no of nodes, this code is using BFS} */
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            al.add(curr.data);
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<Integer> levelOrderTraversal = levelOrder(root);
        for (Integer value : levelOrderTraversal) {
            System.out.print(value + " ");
        }
    }
}
