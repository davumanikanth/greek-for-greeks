// User function Template for Java
class Solution {
    String sort(String s) {
        // code here
       List<Character> newlist=new ArrayList<>();
       for(char ch: s.toCharArray())
       {
           newlist.add(ch);
       }
       Collections.sort(newlist);
       StringBuilder result=new StringBuilder();
       for(char m: newlist)
       {
           result.append(m);
           
       }
       return result.toString();
    }
}