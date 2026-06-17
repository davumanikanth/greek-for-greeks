class Solution {
    public static int countDigits(int n) {
        // Code here
        return f(n);
    }
    public static int f(int n)
    {
        if(n==0)
        {
            return 0;
        }
       return 1+f(n/10); 
        
        
    }
}
