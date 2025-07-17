// User function Template for Java
import java.math.BigInteger;
class Solution {
    public static ArrayList<Integer> factorial(int n) {
        // code here. 
        ArrayList<Integer> group=new ArrayList<>();
        BigInteger num=fact(n);
        String result=num.toString();
        for(int i=0;i<result.length();i++)
        {
            int digit=result.charAt(i)-'0';
            group.add(digit);
        }
        return group;
        
    }
    public static BigInteger fact(int n)
    {
       
        BigInteger f=BigInteger.ONE;
        
        for(int i=2;i<=n;i++)
        {
            f=f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}