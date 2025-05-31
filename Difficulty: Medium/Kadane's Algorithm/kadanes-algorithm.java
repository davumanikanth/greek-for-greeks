class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int n=arr.length;
        int maxvalue=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            maxvalue=Math.max(maxvalue,sum);
            if(sum<0)
            {
                sum=0;
            }
            
        }
        return maxvalue;
    }
}
