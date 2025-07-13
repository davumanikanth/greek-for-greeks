class Solution {
    public String reverseWords(String s) {
        // Code here
      String[] word=s.split("\\s+");
      String[] result=new String[word.length];
      int index=0;
      for(int i=word.length-1;i>=0;i--)
      {
        result[index++]=word[i];

      }
      String sentence=String.join(" ",result);
      return sentence.trim();
    }
}
