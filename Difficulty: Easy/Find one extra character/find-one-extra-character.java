// User function Template for Java
class Solution {
    public static char extraChar(String s1, String s2) {

        // write your code here
        char[] first=s1.toCharArray();
       char[] second=s2.toCharArray();
       char xor=0;
       for(int i=0;i<first.length;i++)
       {
           xor=(char)(xor^first[i]);
       }
       for(int i=0;i<second.length;i++)
       {
           xor=(char)(xor^second[i]);
       }
       return xor;
    }
}
