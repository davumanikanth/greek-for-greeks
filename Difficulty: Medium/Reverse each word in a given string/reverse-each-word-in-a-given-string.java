class Solution {
    public String reverseWords(String s) {
        // Code here
        String[] word=s.split("\\s+");
        String[] newWord=new String[word.length];
                    int index=0;

        for(int i=0;i<word.length;i++)
        {
            newWord[index++]=reverse(word[i]);
        }
        String sent=String.join(" ",newWord);
        return sent.trim();
        
    }
    public String reverse(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }
}
