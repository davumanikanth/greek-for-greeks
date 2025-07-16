class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        Map<Character,Integer> group=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            group.put(ch,group.getOrDefault(ch,0)+1);
        }
        char word='$';
        for(Map.Entry<Character,Integer> entry:group.entrySet())
        {
            if(entry.getValue()==1)
            {
               return entry.getKey();
                
            }
        }
        return '$';
    }
}
