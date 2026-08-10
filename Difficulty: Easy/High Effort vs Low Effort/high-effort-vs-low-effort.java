class Solution {
    public int maxTask(int[] h, int[] l) {

        int n = h.length;

        int[] dp = new int[n];

        dp[0] = Math.max(h[0], l[0]);

        for (int i = 1; i < n; i++) {

            // Do nothing
            int nothing = dp[i - 1];

            // Low-effort task
            int low = dp[i - 1] + l[i];

            // High-effort task
            int high = h[i];

            if (i >= 2) {
                high += dp[i - 2];
            }

            dp[i] = Math.max(nothing, Math.max(low, high));
        }

        return dp[n - 1];
    }
}