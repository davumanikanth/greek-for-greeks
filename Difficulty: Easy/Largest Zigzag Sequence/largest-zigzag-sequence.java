class Solution {
    public int solve(int day,int[][] arr,int last,int[][] dp)
    {
        if(day==0)
        {
            int max=0;
            for(int i=0;i<arr[0].length;i++)
            {
                if(i!=last)
                {
                    max=Math.max(max,arr[0][i]);
                }
            }
            return max;
        }
        
        if(dp[day][last]!=-1) return dp[day][last];
        
        
        int maxi=0;
        for(int i=0;i<arr[0].length;i++)
        {
            if(i!=last)
            {
                int points=arr[day][i]+solve(day-1,arr,i,dp);
                maxi=Math.max(points,maxi);
            }
        }
        return dp[day][last]=maxi;
    }
    public int zigzagSequence(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
         int[][] dp = new int[n][m + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }


       
        // m means there is no previous column
        return solve(n - 1, mat, m,dp);
        
    }
}