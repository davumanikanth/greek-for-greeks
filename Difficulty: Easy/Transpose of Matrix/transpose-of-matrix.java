class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        ArrayList<ArrayList<Integer>> group=new ArrayList<>();
        
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<m;j++)
        //     {
        //         int temp=mat[i][j];
        //         mat[i][j]=mat[j][i];
        //         mat[j][i]=temp;
        //     }
        // }
        for(int i=0;i<m;i++)
        {
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                row.add(mat[j][i]);
            }
            group.add(row);
        }
        return group;
        
    }
    
}