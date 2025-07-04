// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        char[] letters=str2.toCharArray();
        for(char ch: letters)
        {
            str1=str1.replaceAll(String.valueOf(ch),"");
        }
        return str1;
    }
}