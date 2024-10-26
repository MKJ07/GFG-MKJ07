/*Question: Occurence of an integer in a Linked List.
Link: https://www.geeksforgeeks.org/problems/occurence-of-an-integer-in-a-linked-list/1

Input: Linked List: 1->2->1->2->1->3->1, key = 1
Output: 4
Explanation: 
    1 appears 4 times. 

Input: Linked List: 1->2->1->2->1, key = 3
Output: 0
Explanation: 
    3 appears 0 times.
*/

public class OccurenceofanintegerinaLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int count(Node head, int key) {
        /*This approach has TC: O(n) and SC: O(1) {n: no of elements } */
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            if (temp.data == key) {
                cnt++;
            }
            temp = temp.next;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(10);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(10);

        int key = 10;
        int occurrences = count(head, key);

        System.out.println("Occurrences of " + key + ": " + occurrences);
    }
}
