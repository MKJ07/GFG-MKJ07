import java.io.*;
/*Question:- Move Last Element to Front of a Linked List
Link:-https://practice.geeksforgeeks.org/problems/move-last-element-to-front-of-a-linked-list/1

Input: N = 5 List = {2,5,6,2,1}
Output: {1,2,5,6,2}
Explanation: In the given linked list, the last element is 1,after moving the last element to the front the
linked list will be {1,2,5,6,2}.

Input: N = 1 List = {2}
Output: {2}
Explanation: Here 2 is the only element so, the linked list will remain the same.
*/
//{ Driver Code Starts
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
    
    public static Node inputList(BufferedReader br) throws IOException
    {
        // int n = Integer.parseInt(br.readLine().trim()); // Length of Linked List
        
        String[] s = br.readLine().trim().split(" ");
        Node head = new Node(Integer.parseInt(s[0])), tail = head;
        for(int i = 1; i < s.length; i++)
            tail = tail.next = new Node(Integer.parseInt(s[i]));
        
        return head;
    }
    
    public static void printList(Node node)
    {
        while (true)
        { 
    		System.out.print(node.data);
    		node = node.next; 
    		if(node == null)
    		    break;
    		System.out.print(" ");
    	}  
    	System.out.println();
    }
}

public class Move_Last_Element_to_Front_of_a_LinkedList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            Node head = Node.inputList(br);
            
            Solution obj = new Solution();
            Node res = obj.moveToFront(head);
            
            Node.printList(res);
            
        }
    }
}
// } Driver Code Ends
class Solution {
    // This is code you need use in the problem.
    public Node moveToFront(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        Node lastSecond = curr.next;
        while (lastSecond.next != null) {
            lastSecond = lastSecond.next;
            curr = curr.next;
        }
        Node v = lastSecond;
        curr.next = null;
        v.next = head;
        head = v;
        return head;

    }
}
