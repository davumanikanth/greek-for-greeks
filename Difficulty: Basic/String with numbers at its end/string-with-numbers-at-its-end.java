// User function Template for Java
import java.math.BigInteger;
class Solution {
    int isSame(String s) {
        
        int  charcount=0;
       
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(Character.isLetter(ch))
            {
                charcount++;
                
            }
            else
            {
                result.append(ch);
               
                
            }
            
        }
        if(result.length()==0)
        {
            return 0;
        }
        
        BigInteger num=new BigInteger(result.toString());
       BigInteger charco=BigInteger.valueOf(charcount);
       
        if(charco.equals(num))
        {
            return 1;
        }
        return 0;
        
        
    }
}