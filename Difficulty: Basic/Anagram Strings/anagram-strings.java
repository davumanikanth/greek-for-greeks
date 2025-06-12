// User function template for Java
class Solution {
    static int areAnagram(String S1, String S2) {
        // code here
        if(S1.length()!=S2.length())
        {
            return 0;
        }
        char[] first=S1.toCharArray();
        char[] second=S2.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        if(Arrays.equals(first,second))
        {
            return 1;
        }
        return 0;
    }
}