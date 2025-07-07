class Solution {
    public int count(String s) {
        // code here
        Map<Character,Integer > group=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            group.put(ch,group.getOrDefault(ch,0)+1);
            
        }
        int count=0;
        for(Map.Entry<Character,Integer> entry:group.entrySet())
        {
            if(entry.getValue()%2==0)
            {
                count++;
            }
        }
        return count;
    }
}