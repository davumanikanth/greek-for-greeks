class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length())
        {
            return false;
        }
        HashMap<Character,Character> group1=new HashMap<>();
        HashMap<Character,Character> group=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            char ch1=s2.charAt(i);
            if(group.containsKey(ch))
            {
                if(group.get(ch)!=ch1)
                {
                    return false;
                }
            }
            if(group1.containsKey(ch1))
            {
                if(group1.get(ch1)!=ch)
                {
                    return false;
                }
                
            }
            group.put(ch,ch1);
            group1.put(ch1,ch);
            
            
        }
        
        return true;
    }
}