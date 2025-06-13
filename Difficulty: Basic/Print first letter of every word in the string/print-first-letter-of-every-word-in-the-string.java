// User function Template for Java

class Solution {
    String firstAlphabet(String s) {
        // code here
        s=s.trim();
        String[] words=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word: words)
        {
            if(!word.isEmpty())

{
    result.append(word.charAt(0));
}        }
return result.toString();
    }
};