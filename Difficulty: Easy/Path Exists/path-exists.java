class Solution {
    public boolean checkPath(int V, int[][] edges, int src, int dest) {
        // Code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
        
        for(int[] e:edges)
        {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
         boolean[] visited=new boolean[V];
         return bfs(adj,visited,src,dest);
         
         
    }
    public boolean bfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int s,int d)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        visited[s]=true;
        while(!q.isEmpty())
        {
            int curr=q.remove();
            if(curr==d)
            {
                return true;
            }
            
             for(int e:adj.get(curr))
             {
                 if(visited[e]==false)
                 {
                     visited[e]=true;
                     q.add(e);
                 }
                 
                 
             }
        }
        return false;
        
    }
}
