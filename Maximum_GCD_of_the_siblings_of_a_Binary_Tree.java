import java.io.*;
import java.util.*;
/*Question:-Find the maximum GCD of the siblings of a Binary Tree
Link:-https://practice.geeksforgeeks.org/problems/6eb51dc638ee1b936f38d1ab4b2f7062d4425463/1
Input:
         4
       /   \
      5     2
     /  \
    3    1
        /  \
        6   12

Output: 3
Explanation: For the above tree, the maximum GCD for the siblings is formed for nodes 6 and 12
for the children of node 3.

Input: 
            1
          /   \
        3      5
      /  \    /  \
     6    9  4    8

Output: 5
Explanation: For the above tree, the maximum GCD for the siblings is formed for nodes 4 and 8
for the children of node 5.
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
class GFG {

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    static void printInorder(Node root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data + " ");

        printInorder(root.right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);

            Solution ob = new Solution();
            System.out.println(ob.maxGCD(root));
            t--;
        }
    }
}

class Solution {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    Stack<Node> st = new Stack<>();
    int max = Integer.MIN_VALUE;
    int res = 0;

    int maxGCD(Node root) {
        if (root == null) {
            return 0;
        }
        st.push(root);
        while (!st.isEmpty()) {
            Node ch = st.pop();
            if (ch.left != null && ch.right != null) {
                int g = gcd(ch.left.data, ch.right.data);
                if (g >= max) {
                    max = g;
                    res = ch.data;
                }
                st.push(ch.left);
                st.push(ch.right);
            } else if (ch.left != null && ch.right == null) {
                st.push(ch.left);
            } else if (ch.left == null && ch.right != null) {
                st.push(ch.right);
            }

        }
        return res;

    }
}
