// User function Template for Java

class Solution {
    static boolean check_duck(String N) {
        // code here
        if(N.charAt(0)=='0')
        {
            return false;
        }
        if(N.charAt(0)!='0')
        {
        for(int i=1;i<N.length();i++)
        {
           char ch=N.charAt(i);
           if(ch=='0')
           {
               return true;
           }
        }
        }
        return false;
        
        
    }
}