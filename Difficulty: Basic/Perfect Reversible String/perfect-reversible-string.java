// User function Template for Java

class Solution {
    public int isReversible(String str, int n) {
        // complete the function here
        String result=new StringBuilder(str).reverse().toString();
        String temp=str;
        if(str.equals(result))
        {
            return 1;
        }
        return 0;
    }
}