// User function Template for Java

class Sol {
    int countCamelCase(String s) {
        // your code here
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                count++;
            }
        }
        return count;
    }
}