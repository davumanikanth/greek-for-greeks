// User function Template for Java

class Solution {
    String[] orderString(String s[], int n) {
        Arrays.sort(s);
        String[] result=new String[2];
        result[0]=s[0];
        result[1]=s[s.length-1];
        return result;
        
    }
}