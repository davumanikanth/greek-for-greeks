// User function Template for Java
class Solution {
    int countWords(String s) {
        // code here
        s=s.replaceAll("\\\\t"," ");
        s=s.replaceAll("\\\\n"," ");
        s=s.trim();
        if(s.isEmpty()) return 0;
        String[] word=s.split("\\s+");
        return word.length;
    }
}