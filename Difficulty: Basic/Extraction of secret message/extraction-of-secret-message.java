// User function Template for Java

class Solution {
    String ExtractMessage(String S) {
        // code here
        S=S.replace("LIE", " ");
        S=S.replaceAll("\\s+"," ").trim();
        return S;
    }
}
