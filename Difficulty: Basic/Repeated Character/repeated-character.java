// User function Template for Java
class Solution {
    char firstRep(String S) {
        // your code here
        Map<Character,Integer> group=new LinkedHashMap<>();
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            group.put(ch,group.getOrDefault(ch,0)+1 );
            
        }
        char[] newarray=new char[S.length()];
        int index=0;
        for(Map.Entry<Character,Integer> entry:group.entrySet())
        {
            if(entry.getValue()>1)
            {
                newarray[index++]=entry.getKey();
            }
        }
        if(newarray[0]==0)
        {
            return '#';
        }
        return newarray[0];
    }
}