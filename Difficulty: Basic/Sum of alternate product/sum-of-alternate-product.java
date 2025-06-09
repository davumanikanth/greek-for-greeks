class Solution {
    public int altProduct(int[] arr) {
        // Your code goes here
        int n=arr.length;
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<n/2;i++)
        
        {
            sum=sum+arr[i] *arr[n-i-1];
            
        }
        return sum;
    }
}