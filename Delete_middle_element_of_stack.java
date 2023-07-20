import java.util.Scanner;
import java.util.Stack;
/*Questi */
public class Delete_middle_element_of_stack {
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        int mid=(sizeOfStack+1)/2;
        int round=(int)Math.ceil(mid);
        s.remove((int)round-1);
        
    } 
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack <Integer> myStack=new Stack<>();
            
            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);
                
            }
                Delete_middle_element_of_stack obj=new Delete_middle_element_of_stack();
                obj.deleteMid(myStack,sizeOfStack);
                
                while(!myStack.isEmpty())
                {
                    System.out.print(myStack.peek()+" ");
                    myStack.pop();
                }
                System.out.println();
        }
        sc.close();
    }
}
