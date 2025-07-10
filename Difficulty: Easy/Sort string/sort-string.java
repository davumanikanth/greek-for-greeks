// User function Template for Java

class Solution {
    public String SortedString(String str) {
        // Code here
      int vowel=0;
      if(str.matches("^[aeiouAEIOU].*"))
      {
          vowel=1;
      }
     
      char[] letter=str.toCharArray();
      char[] vow=new char[letter.length];
      char[] con=new char[letter.length];
      int index=0;
      int index1=0;
      Arrays.sort(letter);
      for(int i=0;i<letter.length;i++)
      {
          if(letter[i]=='a'||letter[i]=='e'||letter[i]=='i'||letter[i]=='o'||letter[i]=='u')
          {
              vow[index++]=letter[i];
          }
          else
          {
              con[index1++]=letter[i];
          }
      }
      StringBuilder result=new StringBuilder();
      int maxlength=Math.max(index,index1);
      for(int i=0;i<maxlength;i++)
      {
          if(vowel==1)
          {
              if(i<index1)
              {
                  result.append(vow[i]);
              }
              if(i<index1)
              {
                  result.append(con[i]);
              }
          }
          else
          {
              if(i<index1)
              {
                  result.append(con[i]);
              }
              if(i<index1)
              {
                  result.append(vow[i]);
              }
          }
      }
      
      return result.toString();
    }
}
