class Solution {
    public int getSecondLargest(int[] nums) {
        // code here
        int n=nums.length;
        int largest=nums[0];
        for(int i=0;i<n;i++)
        {
            if(nums[i]>largest)
            {
                largest=nums[i];
            }
        }
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>secondlargest && nums[i]!=largest)
            {
                secondlargest=nums[i];
            }
        }
        if(secondlargest==Integer.MIN_VALUE)
        {
            return -1;        }
    
    return secondlargest;
}
}