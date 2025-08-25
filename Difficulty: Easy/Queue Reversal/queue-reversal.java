class Solution {
    // Function to reverse the queue.
    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        // code here.
        Queue<Integer> q=new LinkedList<>();
        int n=queue.size();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++ )
        {
            int num=queue.remove();
            stack.push(num);
        }
        int num2=stack.size();
        for(int i=0;i<num2;i++)
        {
            q.add(stack.pop());
        }
    return q;
        
    }
    
    
}