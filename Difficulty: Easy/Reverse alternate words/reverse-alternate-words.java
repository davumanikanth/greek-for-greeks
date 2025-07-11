// User function Template for Java
class Solution {
    String reverseAlternate(String s) {
        // code here
        String[] word=s.split("\\s+");
        String[] result=new String[word.length];
        int index=0;
        for(int i=0;i<word.length;i++)
        {
            if(i%2!=0)
            {
                result[index++]=new StringBuilder(word[i]).reverse().toString();
            }
            else
            {
                result[index++]=word[i];
            }
        }
        String sentence=String.join(" ",result);
        return sentence;
    }
}