

class Solution {
    public String is_common(String[] s, String[] t) {
        // Code here
        Set<String> food=new HashSet<>();
        for(int i=0;i<s.length;i++)
        {
            food.add(s[i]);
            
        }
        Set<String> food2=new HashSet<>();
        for(int i=0;i<t.length;i++)
        {
            if(food.contains(t[i]))
            {
                return "CHANGE";
            }
        }
        return "BEHAPPY";
        
    }
}
