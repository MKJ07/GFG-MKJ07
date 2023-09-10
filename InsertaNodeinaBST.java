/*Question: Insert a node in a BST.
Link: https://practice.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1

Input:
        2
      /   \
     1     3
             \
              6
K = 4
Output: 
1 2 3 4 6
Explanation: 
After inserting the node 4
Inorder traversal of the above tree will be 1 2 3 4 6.
 */
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
public class InsertaNodeinaBST {
    Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
        }
        Node curr = root;
        while (true) {
            if (curr.data > key) {
                if (curr.left != null) {
                    curr = curr.left;
                } else {
                    curr.left = new Node(key);
                    break;
                }
            } else if (curr.data < key) {
                if (curr.right != null) {
                    curr = curr.right;
                } else {
                    curr.right = new Node(key);
                    break;
                }
            } else {
                break; // Duplicate keys are not allowed in a BST
            }
        }
        return root;
    }

    void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        InsertaNodeinaBST bst = new InsertaNodeinaBST();
        Node root = null;
        root = bst.insert(root, 1);
        root = bst.insert(root, 2);
        root = bst.insert(root, 3);

        //inserting a node in bst
        root = bst.insert(root, 4);
        bst.inorderTraversal(root);
    }
}
