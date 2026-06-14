class Solution {
    static int nthFibonacci(int n) {
        // code here
        return fib(n);
    }
    public static int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}

