class Solution {
    public int findIndex(String s) {
        // code here
        int n= s.length();
        int open = 0; int close =0 ;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ')') {
                close++;
            }
        }
        
        for(int j =0 ; j <= n ;j++)
        {
            if(open == close ) return j;

            if(s.charAt(j) == '(')
                {
                    open ++;
                }
                    else
                    {
                    close--;
                    }
               
        
        }
        return -1;
        
    }
}