// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int nums1[], int nums2[]) {
        int n=nums1.length;
        int m=nums2.length;
        int[] love=new int[n+m];
        int[] newfun=new int[n+m];
        int index=0;
        for(int i=0;i<n;i++)
        {
            love[index]=nums1[i];
            index++;
        }
        for(int i=0;i<m;i++)
        {
            love[index]=nums2[i];
            index++;
        }
        Arrays.sort(love);
        int uniqcount=1;
        
        for(int i=1;i<index;i++)
        {
           if(love[i]!=love[i-1])
           {
               uniqcount++;
           }
            
        }
        
        int[] result=new int[uniqcount];
         result[0]=love[0];
         int newindex=1;
         
        for(int i=1;i<index;i++)
        {
            if(love[i]!=love[i-1])
            {
                result[newindex]=love[i];
                newindex++;
            }
        }
        
        ArrayList<Integer> output=new ArrayList<>();
        for(int i=0;i<uniqcount;i++)
        {
            output.add(result[i]);
        }
        // add your code here
        return output;
        
    }
}
