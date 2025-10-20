class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean visited[] =new boolean[adj.size()];
        Queue<Integer> q=new LinkedList<>();
        q.offer(0);
        visited[0]=true;
        while(!q.isEmpty())
        {
            int rem=q.poll();
            bfs.add(rem);
            
            
            
            for(int con: adj.get(rem))
            {
                if(visited[con]==false)
                {
                    visited[con]=true;
                    q.offer(con);
                }
            }
        }
        return bfs;
        
        
        
        
        
    }
}