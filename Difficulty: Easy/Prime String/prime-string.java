// User function Template for Java

class Solution {
    public boolean isPrimeString(String s) {
        // code here.
        int n=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            n+=(int) ch;
        }
    
    if(n<=1) return false;
    if(n==2) return false;
    if(n%2==0) return false;
    for(int i=3;i<=Math.sqrt(n);i++)
    {
        if(n%i==0)
        {
            return false;
        }
    }
    return true;
    }
}