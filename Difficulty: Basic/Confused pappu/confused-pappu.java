// User function Template for Java
class Solution {
    long findDiff(long amount) {
        // code here
       String number=String.valueOf(amount);
       
       if(number.contains("6" )||number.contains("9"))
       {
           number=number.replaceAll("6","9");
          
       }
       long number2=Long.parseLong(number);
       return number2-amount;
       
    }
}
