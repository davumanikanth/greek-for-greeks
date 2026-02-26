class Solution {
    // Function to count paths between two vertices in a directed graph.
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source,
                          int destination) {
        // Code here
        int count=0;
        Queue<Integer> q=new LinkedList<>();
        
        q.add(source);
        while(!q.isEmpty())
        {
            int node=q.remove();
            if(node==destination)
            {
                count++;
                
            }
           for(int nei:adj.get(node))
           {
               q.add(nei);
           }
        }
        return count;
    }
}