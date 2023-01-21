/*Question:- Nth node from end of linked list
Link:-https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1

Input: N = 2 LinkedList: 1->2->3->4->5->6->7->8->9
Output: 8
Explanation: In the first example, there are 9 nodes in linked list and we need
to find 2nd node from end. 2nd node from end is 8.

Input: N = 5 LinkedList: 10->5->100->5
Output: -1
Explanation: In the second example, there are 4 nodes in the linked list and we
need to find 5th from the end. Since 'n' is more than the number of nodes in the
linked list, the output is -1.
 */

//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList_Element_From_Last {
    Node head;
    Node tail;

    /* Function to print linked list */
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            LinkedList_Element_From_Last llist = new LinkedList_Element_From_Last();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }
            Nth_node_from_end_of_linkedlist g = new Nth_node_from_end_of_linkedlist();
            System.out.println(g.getNthFromLast(llist.head, k));
            t--;
        }
        sc.close();
    }
}
// } Driver Code Ends
public class Nth_node_from_end_of_linkedlist {
    // The Code goes here...
    int getNthFromLast(Node head, int n) {
        if (head == null) {
            return -1;
        }
        int c = 0;
        Node curr = head;
        while (curr != null) {
            c++;
            curr = curr.next;
        }
        if (n > c) {
            return -1;
        }
        Node res = head;
        int result = 0;
        for (int i = 0; i <= c - n; i++) {
            result = res.data;
            res = res.next;
        }
        return result;
    }

}
