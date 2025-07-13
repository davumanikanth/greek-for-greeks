class Solution {
    // Function to check if a string can be obtained by rotating
    // another string by exactly 2 places.
    public static boolean isRotated(String s1, String s2) {
        // Your code here
        if(s1==null ||s2==null) return false;
        if(s1.length()!=s2.length()) return false;
        if(s1.length()<2) return false;
       String r1=s1.substring(2)+s1.substring(0,2);
       String r2=s1.substring(s1.length()-2)+s1.substring(0,s1.length()-2);
       if(r2.equals(s2) ||  r1.equals(s2))
       {
           return true;
       }
       return false;
    }
   
}















