
class Solution {
    // Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String s) {
        // Your code here
        Map<Character,Integer> group=new TreeMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            group.put(ch,group.getOrDefault(ch,0)+1);
        }
        int max=0;
        char c=s.charAt(0);
        for(Map.Entry<Character,Integer> entry:group.entrySet())
        {
            if(entry.getValue()>max)
            {
                max=entry.getValue();
                c=entry.getKey();
            }
        }
        return c;
    }
}