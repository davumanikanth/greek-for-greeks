class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        int n=s.size();
        int[] arr=new int[s.size()];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.pop();
        }
       
       
        for(int i=arr.length-1;i>=0;i--)
        {
            
            int mid;
            mid=arr.length/2;
        
            if(mid==i)
            {
                continue;
            }
            else
            {
                s.push(arr[i]);
            }
       
        }
        
    }
}