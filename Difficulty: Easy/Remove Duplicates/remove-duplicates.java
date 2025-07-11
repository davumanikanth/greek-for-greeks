// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        Set<Character> group=new LinkedHashSet<>();
        for(int i=0;i<s.length();i++)
        
        {
            char ch=s.charAt(i);
            group.add(ch);
            
        }
        StringBuilder result=new StringBuilder();
        for(char ch:group)
        {
            result.append(ch);
        }
        return result.toString();
    }
}