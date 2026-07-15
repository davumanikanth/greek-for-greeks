class Solution {
    int count(int n,int[] height,int[] dp)
    {
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int left=count(n-1,height,dp)+ Math.abs(height[n]-height[n-1]);
        int right=Integer.MAX_VALUE;
        if(n>1)
        {
          right=count(n-2,height,dp)+ Math.abs(height[n]-height[n-2]);
        }
        
        return dp[n]=Math.min(left,right);
        
        
    }
    int minCost(int[] height) {
        // code here
        int[] dp=new int[height.length+1];
        Arrays.fill(dp,-1);
        int i=0;
        
        return count(height.length-1,height,dp);
        
    }
}