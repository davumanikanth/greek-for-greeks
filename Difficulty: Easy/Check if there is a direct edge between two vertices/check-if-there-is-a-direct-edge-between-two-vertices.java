class Solution {
    public boolean checkEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        //  ode here
        for(int j:adj.get(u))
        {
            if(j==v)
            {
                return true;
            }
        }
        return false;
        
    }
}