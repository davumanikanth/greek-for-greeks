class Solution {
    public ArrayList<ArrayList<Integer>> matToAdj(int[][] mat) {
        // code 
        int v=mat.length;
        int m=mat[0].length;
        
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<v;i++){
            ArrayList<Integer> group=new ArrayList<>();
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                {
                    group.add(j);
                }
            }
            adj.add(group);
            
        }
        return adj;
    }
}