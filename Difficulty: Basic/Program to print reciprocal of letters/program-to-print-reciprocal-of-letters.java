// User function Template for Java
class Solution {
    static String reciprocalString(String s) {
        // code here
        StringBuilder result=new StringBuilder();
      for(int i=0;i<s.length();i++) {
          char c=s.charAt(i);
       if(Character.isLowerCase(c))
       {
          result.append((char)('z'-(c-'a')));
       }
       else if(Character.isUpperCase(c))
       {
             result.append((char)('Z'-(c-'A')));
       }
       else
       {
            result.append(c);
       }
      }
      return result.toString();
    }
}