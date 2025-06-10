// User function template for Java

class Solution {
    static String delAlternate(String S) {
        // code here
        String result="";
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            if(i%2==0)
            {
                result=result+ch;
                
            }
        }
        return result;
    }
}