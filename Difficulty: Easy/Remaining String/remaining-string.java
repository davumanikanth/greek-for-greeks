class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        // int[] value=int value[count];
        int index=1;
        int charindex=-1;
        
        for(int i=0;i<s.length();i++)
        {
            char chs=s.charAt(i);
            if(chs==ch ){
                if(index==count)
                {
                    charindex=i;
                    break;
                }
                else
                {
                    index++;
                }
                
            }
            
        }
       if(charindex!=-1)
       {
                   return s.substring(charindex+1);

       }
      else
      {
          return "";
      }
    }
}