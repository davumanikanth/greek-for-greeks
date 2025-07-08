class Solution {
    public String maximumFrequency(String s) {
        // Your Code goes here
        String[] word=s.split("\\s+");
        Map<String,Integer> group=new LinkedHashMap<>();
        for(int i=0;i<word.length;i++)
        {
            group.put(word[i],group.getOrDefault(word[i],0)+1);
        }
        int max=0;
        String key="";
        for(Map.Entry<String,Integer> entry:group.entrySet())
        {
            if(entry.getValue()>max)
            {
                max=entry.getValue();
                key=entry.getKey();
                
            }
            // else if(entry.getValue()==1)
            // {
            //     max=entry.getValue();
            //     key=entry.getKey();
            //     break;
            // }
        }
        StringBuilder result=new StringBuilder();
        result.append(key).append(" ").append(max);
        return result.toString();
    }
}