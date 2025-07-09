// User function Template for Java

class Solution {
    long ExtractNumber(String sentence) {
        // code here
        String[] word=sentence.split("\\s+");
        // long[] digit=new long[word.length()];
        // long index=0;
        long result=-1;
        for(int i=0;i<word.length;i++)
        {
            if(word[i].matches("\\d+") && !word[i].contains("9"))
            {
                result=Math.max(Long.parseLong(word[i]),result);
            }
            
        }
       return result;
    }
}