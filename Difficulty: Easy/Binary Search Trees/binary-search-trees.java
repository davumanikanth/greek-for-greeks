// User function Template for Java

class Solution {
    static boolean isBSTTraversal(int arr[]) {
        // code here
        boolean test=false;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>=arr[i+1])
            {
                return false;
            }
        }
        // if(test) return false;
        return true;
    }
}
