import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Pairwiseswapelementsofalinkedlist {
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
            HashMap<Node, Integer> mp = new HashMap<Node, Integer>();
            mp.put(head, head.data);
            for (int i = 0; i < n - 1; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
                mp.put(tail, tail.data);
            }

            Node failure = new Node(-1);

            Solution g = new Solution();
            head = g.pairwiseSwap(head);

            Node temp = head;
            int f = 0;
            while (temp != null) {
                if (mp.get(temp) != temp.data) {
                    f = 1;
                }
                temp = temp.next;
            }

            if (f == 1) {
                printList(failure);
            } else {
                printList(head);
            }
            t--;
        }
        sc.close();
    }
}

class Solution {
    public Node pairwiseSwap(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = head;
        Node current = head.next;
        head = current;
        prev.next = current.next;
        current.next = prev;

        Node temp = prev;
        prev = prev.next;
        current = temp;

        while (prev != null && prev.next != null) {
            Node nextNode = prev.next;
            temp = nextNode.next;
            prev.next = temp;
            nextNode.next = prev;
            current.next = nextNode;
            current = prev;
            prev = temp;
        }
        return head;
    }
}
