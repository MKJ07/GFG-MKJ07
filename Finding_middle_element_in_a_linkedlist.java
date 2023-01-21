import java.util.*;
/*Question:- Finding middle element in a linked list
Link:-https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1

 */
//{ Driver Code Starts

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

}

class GFG {
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for (int i = 0; i < n - 1; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Finding_middle_element_in_a_linkedlist g = new Finding_middle_element_in_a_linkedlist();
            int ans = g.getMiddle(head);
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}
// } Driver Code Ends

public class Finding_middle_element_in_a_linkedlist {
    int getMiddle(Node head) {
        Node curr;
        if (head == null) {
            return 0;
        }
        int c = 0;
        curr = head;
        while (curr != null) {
            c++;
            curr = curr.next;
        }
        int res = 0;
        Node res1 = head;
        for (int i = 0; i <= c / 2; i++) {
            res = res1.data;
            res1 = res1.next;
        }
        return res;
    }

}
