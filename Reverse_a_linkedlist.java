/*Question:- Reverse a linked list
Link:-https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1

Input: LinkedList: 1->2->3->4->5->6
Output: 6 5 4 3 2 1
Explanation: After reversing the list,elements are 6->5->4->3->2->1.

Input: LinkedList: 2->7->8->9->10
Output: 10 9 8 7 2
Explanation: After reversing the list,elements are 10->9->8->7->2.
*/
//{ Driver Code Starts
import java.util.*;
import java.io.*;

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

    public static void main(String args[]) throws IOException {

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

            Reverse_a_linkedlist ob = new Reverse_a_linkedlist();
            head = ob.reverseList(head);
            printList(head);
            t--;
        }
        sc.close();
    }
}

// } Driver Code Ends
public class Reverse_a_linkedlist
{
    //Function to reverse a linked list.
    Node reverseList(Node head){
        if(head==null){
            return head;
        }
        Node curr=head;
        Node temp;Node res=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=res;
            res=curr;
            curr=temp;
        }
        head=res;
        return head;
    }

}
