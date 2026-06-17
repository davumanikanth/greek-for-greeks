class Solution {
    public int findCoverage(int[][] mat) {
        // code here
        int count=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==0)
                {
                   count+= dfs(mat,i,j);
                }
            }
        }
        return count;
        
        
    }
    public int dfs(int[][] mat, int row, int col) {

    int count = 0;

    // Up
    int r = row;
    while (r >= 0) {
        if (mat[r][col] == 0) {
            r--;
        } else {
            count++;
            break;
        }
    }

    // Left
    int c = col;
    while (c >= 0) {
        if (mat[row][c] == 0) {
            c--;
        } else {
            count++;
            break;
        }
    }

    // Down
    r = row ;
    while (r < mat.length) {
        if (mat[r][col] == 0) {
            r++;
        } else {
            count++;
            break;
        }
    }

    // Right
    c = col;
    while (c < mat[0].length) {
        if (mat[row][c] == 0) {
            c++;
        } else {
            count++;
            break;
        }
    }

    return count;
}
}