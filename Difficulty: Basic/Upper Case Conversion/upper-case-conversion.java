// User function Template for Java

class Solution {
    public String convert(String s) {
        // code here
        String[] words=s.split("\\s+");
        StringBuilder result1=new StringBuilder();
        for(String word: words)
        {
            result1.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
        }
        
        return result1.toString();
    }
}