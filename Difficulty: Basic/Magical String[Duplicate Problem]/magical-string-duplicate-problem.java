// User function Template for Java
class Solution {
    static String magicalString(String S) {
        // code here
        StringBuilder result=new StringBuilder();
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            result.append((char) ('z'-(ch-'a')));
        }
        return result.toString();
    }
}