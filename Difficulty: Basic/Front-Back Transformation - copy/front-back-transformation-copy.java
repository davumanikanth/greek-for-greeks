// User function Template for Java
class Solution {
    String convert(String s) { 
        
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch))
            {
                result.append((char)('z'-(ch-'a')));
            }
            else
            {
                result.append((char)('Z'-(ch-'A')));
            }
        }
        
        
        
        return result.toString()    ; 
        
        
        
    }
}