// User function Template for Java
import java.math.BigInteger;
class Solution {

    String calc_Sum(int arr1[], int arr2[]) {
        // Complete the function
      StringBuilder str=new StringBuilder();
      for(int num: arr1)

{
    str.append(num);
}        
     StringBuilder str1=new StringBuilder();
     for(int num:arr2)
     {
         str1.append(num);
     }
    BigInteger num1=new BigInteger(str.toString());
     BigInteger num2=new BigInteger(str1.toString());
     BigInteger num3=num1.add(num2);
     String value=String.valueOf(num3);
     return value;
    }
}
