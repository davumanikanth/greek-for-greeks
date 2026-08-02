class Solution {

    int[][] dp;

    boolean isPossible(int cur, int prev) {
        return prev % cur == 0 || cur % prev == 0;
    }

    int solve(int n, int m, int index, int prev) {

        if (index >= n)
            return 1;

        if (dp[index][prev] != -1)
            return dp[index][prev];

        int ans = 0;

        for (int i = 1; i <= m; i++) {
            if (isPossible(i, prev))
                ans += solve(n, m, index + 1, i);
        }

        return dp[index][prev] = ans;
    }

    public int count(int n, int m) {

        dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++)
            Arrays.fill(dp[i], -1);

        return solve(n, m, 0, 1);
    }
}