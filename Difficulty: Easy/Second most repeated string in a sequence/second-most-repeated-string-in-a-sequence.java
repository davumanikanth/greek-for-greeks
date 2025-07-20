// User function Template for Java

class Solution {
    String secFrequent(String arr[], int N) {
        // your code here
        HashMap<String,Integer> group=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            group.put(arr[i],group.getOrDefault(arr[i],0)+1);
        }
        // String[] value=new String[group.size()];
        int max=0;
        int secondmax=0;
        String value="";
        String value2="";
        
            for(int num:group.values())
            {
                if(num>max)
                {
                    secondmax=max;
                    max=num;
                }
                else if(num>secondmax && num!=max)
                {
                    secondmax=num;
                    
                }
            }
            
        
        for(Map.Entry<String,Integer> entry: group.entrySet())
        {
            if(entry.getValue()==secondmax)
            {
                return entry.getKey();
            }
        }
        return "";
        
    }
}