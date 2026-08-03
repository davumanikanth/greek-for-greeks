class Solution {
    public int maxSumWithK(int[] arr, int k) {
        // code here
       
         int sum=0;
         
        int[] maxEnd=new int[arr.length];
        maxEnd[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            maxEnd[i]=Math.max(arr[i],maxEnd[i-1]+arr[i]);
        }
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
            
        }
        int max=sum;
        int left=0;
       
        for(int right=k;right<arr.length;right++)
        {
            sum+=arr[right];
            sum-=arr[left];
            max=Math.max(sum,max);
            max=Math.max(max,sum+maxEnd[left]);
            left++;
            
        }
        
        return max;
        
    }
}