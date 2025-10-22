class Solution {
    public int countIslands(char[][] grid) {
        // Code here
        int count=0;
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            
            {
                if(visited[i][j]==false && grid[i][j]=='L')
                {
                    count++;
                
                dfs(i,j,visited,grid);
                }
            }
        }
        return count;
    }
    public void dfs(int row,int col,boolean[][] visited,char[][] grid)
    {
        visited[row][col]=true;
        for(int drow=-1;drow<=1;drow++)
        {
            for(int dcol=-1;dcol<=1;dcol++)
            {
                int nrow=row+drow;
                int ncol=col+dcol;
                if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && visited[nrow][ncol]==false && grid[nrow][ncol]=='L' )
                {
                  
                    dfs(nrow,ncol,visited,grid);
                }
            }
        }
    }
}