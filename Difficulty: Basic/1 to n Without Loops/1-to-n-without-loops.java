class Solution {
    public void printTillN(int n) {
        // code here
        re(n,0);
    }
    public void re(int n,int i)
    {
        if(i>=n)
        {
            return;
        }
        System.out.print(i+1+" ");
        re(n,i+1);
        
    }
}
