import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
/*Code Link:-https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1
Input:
n1 = 2 , n2 = 3  
       1 
      / \ 
     2   3
Output: 1
Explanation:
LCA of 2 and 3 is 1.

Input: n1 = 3 , n2 = 4
           5    
          /    
         2  
        / \  
       3   4
Output: 2
Explanation:
LCA of 3 and 4 is 2. 
*/

class Node{
    int data;
    Node left;
    Node right;
    Node(int data ){
        this.data = data;
        left=null;
        right=null;
    }
}
public class Lowest_Common_Ancestor_in_a_Binary_Tree {
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));      
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            Node currNode = queue.peek();
            queue.remove();
                
            String currVal = ip[i];
                
            if(!currVal.equals("N")) {
                    
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
                
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            if(!currVal.equals("N")) {
                    
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String input[] = br.readLine().trim().split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);
	            String s = br.readLine();
    	    	Node root = buildTree(s);
                Solution g = new Solution();
                Node k = g.lca(root,a,b);
    			System.out.println(k.data);
    	        
	        }
	}
}

// } Driver Code Ends

class Solution
{
    //Function to return the lowest common ancestor in a Binary Tree.
	Node lca(Node root, int n1,int n2)
	{
		if(root==null)
		    return null;
		if(root.data==n1 || root.data==n2)
		    return root;
		Node left=lca(root.left,n1,n2);
		Node right=lca(root.right,n1,n2);
		if(left== null) return right;
		if(right== null) return left;
		return root;
	}
}
