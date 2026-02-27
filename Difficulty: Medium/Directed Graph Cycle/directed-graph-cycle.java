class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        int[] indegree=new int[V];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            int u=edges[i][0];
            
            int v=edges[i][1];
            adj.get(u).add(v);
        }
        
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                int nei=adj.get(i).get(j);
                indegree[nei]++;
            }
            
        }
        
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<indegree.length;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        
        
        
        
        while(!q.isEmpty())
        {
            int node=q.remove();
            result.add(node);
            for(int i=0;i<adj.get(node).size();i++)
            {
                int n=adj.get(node).get(i);
                indegree[n]--;
                if(indegree[n]==0)
                {
                    q.add(n);
                }
            }
            
        }
        
        
        if(result.size()!=V)
        {
            return true;
        }
        return false;
    }
    
}