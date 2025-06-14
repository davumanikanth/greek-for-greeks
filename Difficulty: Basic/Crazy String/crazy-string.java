// User function Template for Java

class Solution {
    static String getCrazy(String s) {
        // Your code here
        int n=s.length();
        StringBuilder result=new StringBuilder();
        StringBuilder result1=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(s.charAt(0)))
            {
                if(i%2!=0)
                {
                   result.append(Character.toLowerCase(ch)); 
                }
                else
                {
                    result.append(Character.toUpperCase(ch));
                }
                
            }
            else 
            {
                if(i%2==0)
                {
                   result.append(Character.toLowerCase(ch)); 
                }
                else
                {
                    result.append(Character.toUpperCase(ch));
                }
                
            }
        }
        return result.toString();
    }
}