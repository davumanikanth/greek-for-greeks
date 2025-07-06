class Solution {
    public int maxSum(int arr[]) {
        // code here
        int maxsum=0;
        for(int i=0;i<arr.length-1;i++)
        {
            int sum=0;
            
                sum=arr[i+1]+arr[i];
                maxsum=Math.max(sum,maxsum);
           
        }
        return maxsum;
    }
}