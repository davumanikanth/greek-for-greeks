class Solution {
    public boolean sentencePalindrome(String s) {
        // code here
        s=s.replaceAll(" ","");
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        String temp=new StringBuilder(s).reverse().toString();
        if(s.equals(temp))
        {
            return true;
        }
        return false;
    }
}