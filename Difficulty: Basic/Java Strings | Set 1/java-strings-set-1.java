// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String result=S1;
        for(int i=0;i<S1.length()+S2.length();i++)
        {
            result=result+S2;
            break;
        }
        String reverse="";
        for(int i=result.length()-1;i>=0;i--)
        {
            char ch=result.charAt(i);
            reverse=reverse+ch;
            
        }
        return reverse;
        
    }
}