class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum=0;
        if(arr.length<k)
        {
            return 0;
        }
        
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
            
        }
        int maxsum=sum;
        for(int i=k;i<arr.length;i++)
        {
            sum+=arr[i]-arr[i-k];
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}