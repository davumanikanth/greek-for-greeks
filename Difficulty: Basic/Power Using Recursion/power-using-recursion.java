class Solution {
    static int RecursivePower(int n, int p) {
        // Code here
        return fib(n,p);
    }
    public static int fib(int n,int pow)
    {
        if(pow==0)
        {
            return 1;
        }
        return n*fib(n,pow-1);
    }
}
