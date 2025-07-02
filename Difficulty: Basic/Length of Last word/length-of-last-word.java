// User function Template for Java
class Solution {
    int findLength(String s) {
        // code here
        String[] word=s.split("\\s+");
        String lastwordlength=word[word.length-1];
        return lastwordlength.length();
        
    }
}