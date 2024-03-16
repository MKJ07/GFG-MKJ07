/*Question: Delete without head pointer.
Link: https://www.geeksforgeeks.org/problems/delete-without-head-pointer/1

Example 1:
Input:
Linked List = 1 -> 2
del_node = 1
Output: 
2
Explanation: 
After deleting 1 from the linked list, 
we have remaining nodes as 2.

Example 2:
Input:
Linked List = 10 -> 20 -> 4 -> 30
del_node = 20
Output: 
10 4 30
Explanation: 
After deleting 20 from the linked list, 
we have remaining nodes as 10, 4, 30.
*/
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Deletewithoutheadpointer {
    public void deleteNode(Node delNode) {
        if (delNode == null || delNode.next == null) {
            return;
        }
        delNode.data = delNode.next.data;
        delNode.next = delNode.next.next;
    }
    public static void main(String[] args) {
        Deletewithoutheadpointer list = new Deletewithoutheadpointer();
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Before deletion:");
        printLinkedList(head);
        list.deleteNode(second);

        System.out.println("After deletion:");
        printLinkedList(head);
    }
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
}
