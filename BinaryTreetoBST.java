import java.util.ArrayList;
import java.util.Collections;
/*Question: Binary Tree to BST
Link: https://practice.geeksforgeeks.org/problems/binary-tree-to-bst/1

Input:
      1
    /   \
   2     3
Output: 
1 2 3
Explanation:
The converted BST will be 
      2
    /   \
   1     3
 */
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreetoBST {
    ArrayList<Integer> al = new ArrayList<>();
    int index = 0;

    private void inOrderTraversalRec(Node root) {
        if (root != null) {
            inOrderTraversalRec(root.left);
            al.add(root.data);
            inOrderTraversalRec(root.right);
        }
    }

    Node constructBST(Node root) {
        if (root != null) {
            // Recursively construct left and right subtrees
            root.left = constructBST(root.left);
            root.data = al.get(index++);
            root.right = constructBST(root.right);
        }
        return root;
    }

    Node binaryTreeToBST(Node root) {
        // Your code here
        inOrderTraversalRec(root);
        Collections.sort(al);
        index = 0; // Reset the index
        return constructBST(root);
    }

    // Utility function to print in-order traversal
    static void printInOrder(Node root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.data + " ");
            printInOrder(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreetoBST converter = new BinaryTreetoBST();

        // Create a sample binary tree
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);

        // Convert the binary tree to a BST
        Node newRoot = converter.binaryTreeToBST(root);

        // Print the in-order traversal of the resulting BST
        printInOrder(newRoot);
    }
}
