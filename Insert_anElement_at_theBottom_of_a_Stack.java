import java.util.Stack;
/*Question: Insert an Element at the Bottom of a Stack.
Link: https://www.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1 

Example 1:
Input:
n = 5
x = 2
st = {4,3,2,1,8}
Output:
{2,4,3,2,1,8}
Explanation:
After insertion of 2, the final stack will be {2,4,3,2,1,8}.

Example 2:
Input:
n = 3
x = 4
st = {5,3,1}
Output:
{4,5,3,1}
Explanation:
After insertion of 4, the final stack will be {4,5,3,1}.
*/
public class Insert_anElement_at_theBottom_of_a_Stack {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        /*This approach has TC: O(n) and SC: O(n) {n: no of elements in the stack} */
        Stack<Integer> res=new Stack<>();
        res.add(x);
        int n=st.size();
        for(int i=0;i<n;i++){
            res.add(st.get(i));
        }
        return res;
    }
    public static void main(String[] args) {
        Insert_anElement_at_theBottom_of_a_Stack obj =new Insert_anElement_at_theBottom_of_a_Stack();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(obj.insertAtBottom(stack, 5));
    }
}
