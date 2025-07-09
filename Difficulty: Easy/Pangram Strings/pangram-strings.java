// User function Template for Java

class Solution {
    int isPanagram(String S) {
        // code here
        S=S.replaceAll(" ","");
        S=S.toLowerCase();
        for(int i='a';i<='z';i++)
        {
            if(S.indexOf(i)==-1)
            {
                return 0;
            }
        }
        return 1;
        
    }
};