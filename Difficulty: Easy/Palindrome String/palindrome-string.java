class Solution {
    boolean isPalindrome(String s) {
        // code here
        if(s.equals(new StringBuilder(s).reverse().toString()))
        {
            return true;
        }
        return false;
    }
}