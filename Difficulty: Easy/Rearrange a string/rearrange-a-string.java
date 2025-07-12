// User function Template for Java

class Solution {
    public String arrangeString(String s) {
        // code here.
        char[] letter=new char[s.length()];
        int l=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            letter[l++]=ch;
        }
        char[] word=new char[letter.length];
        int[] num=new int[letter.length];
        int sum=0;
        int index=0;
        int index1=0;
        for(int i=0;i<letter.length;i++)
        {
            if(Character.isLetter(letter[i]))
            {
                word[index++]=letter[i];
            }
            else
            {
                sum+=Character.getNumericValue(letter[i]);
            }
        }
        Arrays.sort(word,0,index);
        StringBuilder result=new StringBuilder();
        for(int i=0;i<index;i++)
        {
            result.append(word[i]);
            
            
        }
        if(sum==0)
        {
            return result.toString();
        }
        result.append((int)sum);
        return result.toString();
    }
}
