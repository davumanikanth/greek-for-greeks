class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            q.add(arr[i]);
        
            
        }
        int index=0;
        while(!q.isEmpty())
        {
            arr[index]=q.remove();
            index++;
        }
    }
    
}
