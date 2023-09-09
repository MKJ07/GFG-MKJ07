import java.util.ArrayList;
/*Question: Kth largest element in BST.
Link: https://practice.geeksforgeeks.org/problems/kth-largest-element-in-bst/1

Input:
      4
    /   \
   2     9
k = 2 
Output: 4
 */
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
public class KthlargestelementinBST {
    ArrayList<Integer> al = new ArrayList<>();

    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        al.add(root.data);
        inorder(root.right);
    }

    public int kthLargest(Node root, int K) {
        inorder(root);
        int n = al.size();
        int res = al.get(n - K);
        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        int K = 3;
        KthlargestelementinBST t=new KthlargestelementinBST();
        int kthLargestElement = t.kthLargest(root, K);
        System.out.println(kthLargestElement);
    }
    
}
