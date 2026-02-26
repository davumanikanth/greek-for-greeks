class Solution {
    public boolean isBipartite(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {

                int v=edges[i][0];
                int u=edges[i][1];
                adj.get(v).add(u);
                adj.get(u).add(v);
                
            
        }
        boolean[] visited=new boolean[V];
        int[] color=new int[V];
        int n=color.length;
        for(int i=0;i<n;i++)
        {
            color[i]=-1;
            
        }
        
        for(int i=0;i<color.length;i++)
        {
            if(color[i]==-1)
            {
            
                if(dfs(i,adj,color,visited,0)==false)
                {
                    return false;
                }
            }
                
            
            
        }
        return true;
        
    }
    public boolean dfs(int node,ArrayList<ArrayList<Integer>> adj,int[] color,boolean[] visited,int currcolor)
    {
        color[node]=currcolor;
        visited[node]=true;
        for(int nei:adj.get(node))
        {
            if(visited[nei]==false)
            {
                if(!dfs(nei,adj,color,visited,1-color[node]))
                {
                    return false;
                }
                
                
            }
            else
            {
                if(color[node]==color[nei])
                {
                    return false;
                }
            }
        }
      
      return true;
      
        
        
    }
    
}