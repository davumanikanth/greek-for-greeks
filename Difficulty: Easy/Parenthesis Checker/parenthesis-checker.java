
class Solution {
    static boolean isBalanced(String s) {
        // code here
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(ch=='{'|| ch=='['|| ch=='(')
            {
                stack.push(ch);
            }
            else if(ch=='}'|| ch==']'|| ch==')')
            {
               if(stack.isEmpty())
               {
                   return false;
                   
               }
               int top=stack.pop();
               if((ch=='}' && top!= '{') || (ch==')' && top!= '(') ||(ch==']' && top!= '[') )
               
               {
                   return false;
               }               
                
                
                
                
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
