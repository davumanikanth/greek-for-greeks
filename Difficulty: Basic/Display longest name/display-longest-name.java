
class Solution {
    public String longest(List<String> arr) {
        // code here
        String empty="";
       for( String s: arr)
       {
           if(s.length()> empty.length())
           {
               empty=s;
           }
       }
       return empty;
        
    }
}
