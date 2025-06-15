class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        char[] char1=s1.toCharArray();
        Arrays.sort(char1);
         char[] char2=s2.toCharArray();
        Arrays.sort(char2);
        if(Arrays.equals(char1,char2))
        {
            return true;
        }
        return false;
    }
}