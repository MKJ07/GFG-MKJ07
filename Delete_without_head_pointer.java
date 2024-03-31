class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
class Solution {
    void deleteNode(Node del) {
        Node temp = del;
        temp.data = del.next.data;
        temp.next = temp.next.next;
        // We can go by another method in this are copying the del node data
        // to previous node and assigning the previous node to del.next address
        /*
        Node curr=del.next;
        del.data=del.next.data;
        del.next=curr.next;
        */

    }
}

public class Delete_without_head_pointer {
    Node head;
    Node tail;

    void printList(Node head) {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
        System.out.println();
    }

    void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    Node search_Node(Node head, int k) {
        Node current = head;
        while (current != null) {
            if (current.data == k)
                break;
            current = current.next;
        }
        return current;
    }

    public static void main(String args[]) {
    Delete_without_head_pointer llist = new Delete_without_head_pointer();
    Node head = new Node(1); // First element of the linked list
    llist.addToTheLast(head);
    // Add remaining elements to the linked list
    llist.addToTheLast(new Node(2));
    llist.addToTheLast(new Node(3));
    llist.addToTheLast(new Node(4));
    llist.addToTheLast(new Node(5));
    
    int k = 3; // Value of the node to be deleted
    
    Node del = new Node(k);
    // Node del = llist.search_Node(llist.head, k);

    Solution g = new Solution();
    if (del != null) {
        g.deleteNode(del);
    }
    llist.printList(llist.head);

        // Scanner sc = new Scanner(System.in);

        // int t = sc.nextInt();
        // while (t > 0) {
        //     int n = sc.nextInt();
        //     Delete_without_head_pointer llist = new Delete_without_head_pointer();
        //     // int n=Integer.parseInt(br.readLine());
        //     int a1 = sc.nextInt();
        //     Node head = new Node(a1);
        //     llist.addToTheLast(head);
        //     for (int i = 1; i < n; i++) {
        //         int a = sc.nextInt();
        //         llist.addToTheLast(new Node(a));
        //     }

        //     int k = sc.nextInt();
        //     Node del = new Node(k);
        //     // Node del = llist.search_Node(llist.head, k);

        //     Solution g = new Solution();
        //     if (del != null) {
        //         g.deleteNode(del);
        //     }
        //     llist.printList(llist.head);
        //     t--;
        // }
        // sc.close();
    }
}
