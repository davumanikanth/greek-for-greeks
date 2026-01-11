class Solution {
    class pair
    {
        int first;
        int second;
        pair(int first,int second)
        {
            this.first=first;
            this.second=second;
            
        }
    }
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges)
        {
            int u=e[0];
            int v=e[1];
           adj.get(u).add(new pair(v, u));
           adj.get(v).add(new pair(u, v));
        }
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                if(bfs(V,adj,visited,i)==true)
                {
                    return true;
                }
            }
        }
        return false;
        
    }
    public boolean bfs(int V,ArrayList<ArrayList<pair>> adj,boolean[] visited,int src)
    {
        Queue<pair> pq=new LinkedList<>();
        pq.add(new pair(src,-1));
        visited[src]=true;
        while(!pq.isEmpty())
        {
            pair it=pq.remove();
            int node=it.first;
            int parent=it.second;
            for(pair p:adj.get(node))
            {
                int adjnode=p.first;
                if(visited[adjnode]==false)
                {
                    visited[adjnode]=true;
                    pq.add(new pair(adjnode,node));
                }
                // here parent == adjnode is alredy the element came form hter 
                else if(parent!=adjnode)
                {
                    return true;
                }
            }
        }
        return false;
    }
}