class Solution {
    public static int countPairs(int arr[], int k) {
        // code here
        Arrays.sort(arr);
        int count=0;
        int j=0;
        
        for(int i=0;i<arr.length;i++ )
        
        { while(j<arr.length && arr[j]-arr[i]<k)
        {
            j++;
            
        }
        count+=j-i-1;
            
        }
        return count;
    }
}
