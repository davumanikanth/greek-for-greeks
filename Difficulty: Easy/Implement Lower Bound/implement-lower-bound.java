class Solution {
    int lowerBound(int[] nums, int target) {
        // code here
       int n=nums.length;
       for(int i=0;i<n;i++)
       {
           if(nums[i]>= target)
           {
               return i;
           }
       }
       return n;
    }
}
