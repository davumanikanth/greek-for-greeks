

class Solution {
    // Function to calculate sum of all numbers present in a string.
    public static int findSum(String s) {
        // your code here
       s=s.replaceAll("[a-zA-Z]"," ");
        s=s.trim();
        int sum=0;
        String[] value=s.split("\\s+");
        // String[] val=new int[value.length];
        int index=0;
        for(int i=0;i<value.length;i++)
        {
            if(!value[i].isEmpty())
            {
            sum+=Integer.parseInt(value[i]);
            }
            
        }
        return sum; 
    }
}