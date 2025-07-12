// User function Template for Java

class Solution {
    public String amendSentence(String s) {
        // code here
        String[] word=s.split("(?=[A-Z])");
        String sent=String.join(" ",word);
        String sent1=sent.toLowerCase();
        return sent1;
    }
}
