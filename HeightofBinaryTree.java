class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
public class HeightofBinaryTree {
    public static void main(String[] args) {
        // Create a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Calculate the height of the binary tree
        int treeHeight = solution.height(root);

        // Print the height of the binary tree
        System.out.println("Height of the binary tree: " + treeHeight);
    }
}
class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }
}
