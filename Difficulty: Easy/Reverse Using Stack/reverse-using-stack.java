import java.util.Stack;
class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> result=new Stack<>();
        for(int i=0;i<S.length();i++)
        {
            result.push(S.charAt(i));
        }
        StringBuilder find=new StringBuilder();
        while(!result.isEmpty())
        {
         find.append(result.pop());
        }
        return find.toString();
        
    }
}