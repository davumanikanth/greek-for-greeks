// User function Template for Java
import java.math.BigInteger;
class Solution {
    public String addBinary(String s1, String s2) {
        // code here
      BigInteger first=new BigInteger(s1,2);
      BigInteger second=new BigInteger(s2,2);
      BigInteger third=first.add(second);
      
      String result=third.toString(2);
      return result;
    }
}