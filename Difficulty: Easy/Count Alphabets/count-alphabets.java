// User function Template for Java

class Solution {
    static int Count(String S) {
        // code here
        int count=0;
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            if(Character.isLetter(ch))
            {
                count++;
            }
        }
        return count;
    }
}