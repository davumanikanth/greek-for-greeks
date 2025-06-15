// User function Template for Java

class Sol {
    int[] count(String s) {
        // your code here
        int[] values=new int[4];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                values[0]++;
            }
            else if(Character.isLowerCase(ch))
            {
                values[1]++;
            }
            else if(Character.isDigit(ch))
            {
                values[2]++;
            }
            else 
            {
                values[3]++;
            }
        }
        return values;
    }
}