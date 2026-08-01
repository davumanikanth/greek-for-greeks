import java.util.Arrays;

class Solution {

    int[][] dp;

    int solve(int x, int y) {

        if (x < 0 || y < 0)
            return 0;

        if (x == 0 && y == 0)
            return 1;

        if (dp[x][y] != -1)
            return dp[x][y];

        int left = solve(x - 1, y);
        int up = solve(x, y - 1);

        return dp[x][y] = (left + up)%1000000007;
    }

    public int ways(int x, int y) {

        dp = new int[x + 1][y + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return solve(x, y);
    }
}