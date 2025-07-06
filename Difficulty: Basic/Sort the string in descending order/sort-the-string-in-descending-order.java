// User function Template for Java
class Solution {
    String ReverseSort(String s) {
        // code here
       char [] letter=s.toCharArray();
       Arrays.sort(letter);
       StringBuilder result=new StringBuilder();
       for(int i=0;i<letter.length;i++)
       {
           result.append(letter[i]);
       }
       return result.reverse().toString();
    }
}