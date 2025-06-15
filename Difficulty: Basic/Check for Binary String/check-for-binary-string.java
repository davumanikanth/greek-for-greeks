class Solution {
    boolean isBinary(String s) {
        // Your code here
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='2' ||ch=='3'
            ||ch=='4' ||ch=='5' ||ch=='6' 
            ||ch=='7' ||ch=='8' ||ch=='9')
            {
                return false;
            }
            
        }
        return true;
    }
}