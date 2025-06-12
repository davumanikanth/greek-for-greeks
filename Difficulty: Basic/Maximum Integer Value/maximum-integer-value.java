// User function Template for Java

class Solution {
    long MaximumIntegerValue(String S) {
        
        // code here
        
        int[] nums=new int[S.length()];
        int index=0;
       for(int i=0;i<S.length();i++)
       {
            int digit=S.charAt(i)-'0';
           nums[index++]=digit;
           
       }
        
        long result=nums[0];
        
        
        for(int i=1;i<index;i++)
        {
            if(result<=1|| nums[i]<=1)
            {
                result+=nums[i];
            }
            else
            {
                result*=nums[i];
            }
            
            
            
            
        }
        return result;
    }
}