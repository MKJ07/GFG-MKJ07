import java.util.*;
import java.io.*;
/*Question: Insert in a Sorted List.
Link: https://practice.geeksforgeeks.org/problems/insert-in-a-sorted-list/1

Input:
LinkedList: 50->100
data: 75
Output: 
50 75 100
Explanation:
After inserting 75 the sorted linked list will look like the one in the output.
*/
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
public class InsertinaSortedList {
    static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	
    public static void main(String args[]) throws IOException { 
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            int n = sc.nextInt();
            
            Node head = new Node(sc.nextInt());
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Solution g = new Solution();
            head = g.sortedInsert(head,k);
            
            printList(head); 
            t--;
        }
        sc.close();
    } 
    
}
class Solution {
    Node sortedInsert(Node head, int key) {
         Node insert = new Node(key);
        insert.next = null;
        if (head == null || head.data >= key) {
            insert.next = head;
            return insert;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data < key) {
            curr = curr.next;
        }
        insert.next = curr.next;
        curr.next = insert;
        return head;
    }
}
