// User function Template for Java
class Solution {
    String solve(String N) {
        // code here
        Map<Character,Integer> group=new HashMap<>();
        for(int i=0;i<N.length();i++)
        {
            char ch=N.charAt(i);
            group.put(ch,group.getOrDefault(ch,0)+1);
            
        }
       int max=-1,maxvalue=-1;
        for(Map.Entry<Character,Integer> entry:group.entrySet())
        {
          maxvalue=Math.max(maxvalue,entry.getValue());  
        }
        for(Map.Entry<Character,Integer> searchkey:group.entrySet())
        {
           if(searchkey.getValue()==maxvalue)
           {
               max=Math.max(max,Integer.parseInt(searchkey.getKey()+""));
           }
        }
       return String.valueOf(max);
       
    }
}