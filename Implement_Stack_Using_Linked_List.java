import java.util.*;
/*Question:-Implement Stack using Linked List
Link:-https://practice.geeksforgeeks.org/problems/implement-stack-using-linked-list/1?page=1
Input: push(2), push(3), pop(), push(4), pop()
Output: 3 4
Explanation: 
push(2)    the stack will be {2}
push(3)    the stack will be {2 3}
pop()      poped element will be 3, the stack will be {2}
push(4)    the stack will be {2 4}
pop()      poped element will be 4

Input: pop(), push(4), push(5), pop()
Output: -1 5
*/
// Driver Code Starts
class StackNode {
    int data;
    StackNode next;

    StackNode(int a) {
        data = a;
        next = null;
    }
}

class GfG {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            MyStack obj = new MyStack();
            int Q = sc.nextInt();
            while (Q > 0) {
                int QueryType = 0;
                QueryType = sc.nextInt();
                if (QueryType == 1) {
                    int a = sc.nextInt();
                    obj.push(a);
                } else if (QueryType == 2) {
                    System.out.print(obj.pop() + " ");
                }
                Q--;
            }
            System.out.println("");
            t--;
        }
        sc.close();
    }
}//  Driver Code Ends

class MyStack {
    StackNode top;
    // Function to push an integer into the stack.
    void push(int a) {
        StackNode x = new StackNode(a);
        if (top == null) {
            top = x;
            return;
        }
        x.next = top;
        top = x;
    }
    // Function to remove an item from top of the stack.
    int pop() {
        if (top != null) {
            int t = top.data;
            top = top.next;
            return t;
        }
        return -1;
    }
}
