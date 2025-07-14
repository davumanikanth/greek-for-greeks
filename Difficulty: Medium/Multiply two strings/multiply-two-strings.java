import java.math.BigInteger;
class Solution {
    public String multiplyStrings(String s1, String s2) {
        // code here
        
        BigInteger num1=new BigInteger(s1);
        BigInteger num2=new BigInteger(s2);
        BigInteger num3=num1.multiply(num2);
        String str=String.valueOf(num3);
        return str;
}
}