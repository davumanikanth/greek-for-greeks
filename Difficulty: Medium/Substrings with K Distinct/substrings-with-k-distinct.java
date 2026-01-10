class Solution {
    public int countSubstr(String s, int k) {
        //  code here
        return solve(s,k)-solve(s,k-1);
        
    }
    public int solve(String s1,int k)
    {
        int left=0;
        int count=0;
        HashMap<Character,Integer> group=new HashMap<>();
        for(int right=0;right<s1.length();right++)
        {
            char ch=s1.charAt(right);
            group.put(ch,group.getOrDefault(ch,0)+1);
            while(group.size()>k)
            {
                char leftch=s1.charAt(left);
                group.put(leftch,group.get(leftch)-1);
                if(group.get(leftch)==0)
                {
                    group.remove(leftch);
                }
                left++;
                
            }
            count+=right-left+1;
            
        }
        return count;
    }
}