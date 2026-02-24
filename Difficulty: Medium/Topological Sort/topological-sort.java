class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
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
                
            
        }
        Stack<Integer> stack=new Stack<>();
        
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                dfs(i,adj,visited,stack);
            }
        }
        ArrayList<Integer> group=new ArrayList<>();
        
        while(!stack.isEmpty())
        {
            group.add(stack.pop());
        }
        return group;
    }
    public void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] visited,Stack<Integer> stack)
    {
        
        visited[node]=true;
       for(int i=0;i<adj.get(node).size();i++)
       {
           int nei=adj.get(node).get(i);
           if(!visited[nei])
           {
               dfs(nei,adj,visited,stack);
           }
       }
        stack.push(node);
        
    }
    
    
    
    
      
    
    
    
    
    
    
    
    
}