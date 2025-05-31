class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int result=1;
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {
                continue;
            }
            if(arr[i]==arr[i-1]+1)
            {
                count++;
            }
            else 
            {
                count=1;
            }
            result=Math.max(result,count);
        }
        return result;
    }
}