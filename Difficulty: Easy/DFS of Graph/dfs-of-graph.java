class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited=new boolean[adj.size()];
        visited[0]=true;
        ArrayList<Integer> list=new ArrayList<>();
        dfs(0,visited,list,adj);
        return list;
    }
    public void dfs(int node,boolean[] visited,ArrayList<Integer>list,ArrayList<ArrayList<Integer>> adj) 
    {
        visited[node]=true;
        list.add(node);
        for(int con:adj.get(node))
        {
            if(visited[con]==false)
            {
                dfs(con,visited,list,adj);
            }
        }
    }
}