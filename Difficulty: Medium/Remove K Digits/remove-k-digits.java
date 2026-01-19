class Solution {
    public String removeKdig(String s, int k) {
        // code here
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            int ch=s.charAt(i)-'0';
            while(!stack.isEmpty() && k>0 && stack.peek()>ch)
            {
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        //if there are in increasing order
        while(k>0)
        {
            k--;
            stack.pop();
        }
        
        
        
        StringBuilder sb=new StringBuilder();
        for(int num:stack)
        {
            sb.append(num);
        }
        String result=sb.toString().replaceFirst("^0+","");
        if(result.length()==0)
        {
            return "0";
        }
        return result;
    }
}