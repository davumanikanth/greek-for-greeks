class Solution {
    public ArrayList<String> ratInMaze(int[][] mat
    ) {
        // code here
        


        ArrayList<String> ans = new ArrayList<>();
        int n = mat.length;

        if (mat[0][0] == 0) return ans;

        boolean[][] vis = new boolean[n][n];

        int[] dr = {1, 0, 0, -1};
        int[] dc = {0, -1, 1, 0};

        solve(0, 0, mat, vis, "", ans, dr, dc);

        return ans;
    }

    public void solve(int row, int col, int[][] mat,
                      boolean[][] vis, String path,
                      ArrayList<String> ans,
                      int[] dr, int[] dc) {

        int n = mat.length;

        if (row == n - 1 && col == n - 1) {
            ans.add(path);
            return;
        }

        String dir = "DLRU";

        for (int i = 0; i < 4; i++) {

            int nr = row + dr[i];
            int nc = col + dc[i];

            if (nr >= 0 && nr < n &&
                nc >= 0 && nc < n &&
                !vis[nr][nc] &&
                mat[nr][nc] == 1) {

                vis[row][col] = true;

                solve(nr, nc, mat, vis,
                      path + dir.charAt(i),
                      ans, dr, dc);

                vis[row][col] = false; // backtrack
            }
        }
    }
}