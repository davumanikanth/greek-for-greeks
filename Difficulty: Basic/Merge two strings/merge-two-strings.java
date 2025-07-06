// User function Template for Java
class Solution {
    String merge(String S1, String S2) {
        // code here
        char [] first=S1.toCharArray();
        char[] second=S2.toCharArray();
        StringBuilder result=new StringBuilder();
        int maxlength=Math.max(first.length,second.length);
        for(int i=0;i<maxlength;i++)
        {
            if(i<first.length)
            {
                result.append(first[i]);
            }
            if(i<second.length)
            {
                result.append(second[i]);
            }
        }
        return result.toString();
    }
}