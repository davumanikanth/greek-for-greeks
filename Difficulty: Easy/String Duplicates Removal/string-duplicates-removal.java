// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        Set<Character> group=new LinkedHashSet();
        for(int i=0;i<s.length();i++)
        {
            group.add(s.charAt(i));
        }
        StringBuilder result=new StringBuilder();
        for(char ch:group)
        {
            result.append(ch);
        }
        return result.toString();
    }
}
