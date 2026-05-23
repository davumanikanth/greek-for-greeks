class Solution {
    int cntOnes(int[][] grid) {

        int count=0;
        int n=grid.length;
        int m=grid[0].length;

        boolean[][] visited=new boolean[n][m];

        // Left and right boundary
        for(int i=0;i<n;i++) {

            if(grid[i][0]==1 && !visited[i][0])
                dfs(grid,visited,i,0);

            if(grid[i][m-1]==1 && !visited[i][m-1])
                dfs(grid,visited,i,m-1);
        }

        // Top and bottom boundary
        for(int j=0;j<m;j++) {

            if(grid[0][j]==1 && !visited[0][j])
                dfs(grid,visited,0,j);

            if(grid[n-1][j]==1 && !visited[n-1][j])
                dfs(grid,visited,n-1,j);
        }

        // Count trapped 1s
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {

                if(grid[i][j]==1 && !visited[i][j])
                    count++;
            }
        }

        return count;
    }


    public void dfs(int[][] grid, boolean[][] visited, int i, int j) {

        int n=grid.length;
        int m=grid[0].length;

        visited[i][j]=true;

        int[] row={0,1,0,-1};
        int[] col={1,0,-1,0};

        for(int k=0;k<4;k++) {

            int newrow=i+row[k];
            int newcol=j+col[k];

            if(newrow>=0 && newcol>=0 &&
               newrow<n && newcol<m &&
               !visited[newrow][newcol] &&
               grid[newrow][newcol]==1)
            {
                dfs(grid,visited,newrow,newcol);
            }
        }
    }
}