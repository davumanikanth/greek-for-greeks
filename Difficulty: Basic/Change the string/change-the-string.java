// User function Template for Java

class Solution {
    String modify(String s) {
        
        if(Character.isLowerCase(s.charAt(0)))
        {
            return s.toLowerCase();
        }
        else
        {
            return s.toUpperCase();
        }
    }
}