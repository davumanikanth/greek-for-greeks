// User function Template for Java

class Solution {
    static int extractMaximum(String S) {
        // code here
        S=S.replaceAll("[^0-9]"," ");
        String word[]=S.split("\\s+");
        int num[]=new int[word.length];
        int index=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<word.length;i++)
        {
            if(!word[i].isEmpty())
            {
            num[index++]=Integer.parseInt(word[i]);
            }
        }
        for(int i=0;i<num.length;i++)
        {
            max=Math.max(max,num[i]);
        }
        if(max==Integer.MIN_VALUE)
        {
            return -1;
        }
        return max;
    
    }
}
