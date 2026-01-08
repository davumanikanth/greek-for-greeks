class Solution {
    public int countSubarrays(int[] arr, int k) {
        // code here
        int ans=mostcount(arr,k)-mostcount(arr,k-1);
        return ans;
    }
    public int mostcount(int[] arr,int k)
    {
        int left=0;
        int countodd=0;
        int result=0;
        for(int right=0;right<arr.length;right++)
        {
            if(arr[right]%2!=0) countodd++;
            while(countodd>k)
            {
                if(arr[left]%2!=0)
                {
                    countodd--;
                }
                left++;
            }
            result+=right-left+1;
            
        }
        return result;
    }
}
