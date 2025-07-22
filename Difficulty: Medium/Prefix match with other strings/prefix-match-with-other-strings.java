// User function Template for Java

class Solution {
    public int klengthpref(String[] arr, int n, int k, String str) {
        // code here
        if(str.length()<k) return 0;
        String result=str.substring(0,k);
        
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].length()>=k && arr[i].startsWith(result))
            {
                count++;
            }
        }
        return count;
        
    }
}