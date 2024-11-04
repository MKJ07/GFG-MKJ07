public class IsLinkedListLengthEven {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public boolean isLengthEven(Node head) {
        /*This approach has TC: O(n) and SC: O(1) {n: number of nodes in the linked list} */
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        return cnt % 2 == 0;
    }
    public static void main(String[] args) {
        IsLinkedListLengthEven obj = new IsLinkedListLengthEven();
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        
        boolean isEven = obj.isLengthEven(head);
        System.out.println("Is the length of the linked list even? " + isEven); // Should print true
        
        head.next.next.next.next = new Node(5);
        
        isEven = obj.isLengthEven(head);
        System.out.println("Is the length of the linked list even? " + isEven); // Should print false
    }
}
