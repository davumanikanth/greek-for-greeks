class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] nums) {
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0)
            {
               swap(nums,mid,low);
               mid++;
               low++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(nums,mid,high);
                high--;
            }
        }
        // code here
       
        
    }
    public void swap(int[] arr,int n,int m)
    {
        int temp=arr[n];
        arr[n]=arr[m];
        arr[m]=temp;
    }
}