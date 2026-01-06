class Solution {
    public int countEdges(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int v=adj.size();
        int sum=0;
        for(int i=0;i<v;i++)
        {
            sum+=adj.get(i).size();
        }
        return sum/2;
    }
}