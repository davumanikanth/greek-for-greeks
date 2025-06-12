// User function template for Java

class Solution {
    static int RedOrGreen(int N, String S) {
        // code here
        int red=0;
        int green=0;
        for(int i=0;i<N;i++)
        {
            char ch=S.charAt(i);
            if(ch=='R')
            {
                red++;
            }
            else
            {
                green++;
            }
        }
        int minvalue=Math.min(red,green);
        return minvalue;
    }
}