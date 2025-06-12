// User function Template for Java

class Solution {
    static String snakeCase(String S, int n) {
        // code here
        StringBuilder result=new StringBuilder();
        
        
        for(int i=0;i<n;i++)
        {
            char ch=S.charAt(i);
            if(ch==' ')
            {
                result.append('_');
            }
            else
            {
                result.append(Character.toLowerCase(ch)); 
            }
        }
        return result.toString();
    }
};