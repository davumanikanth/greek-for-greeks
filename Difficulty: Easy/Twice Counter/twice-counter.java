// User function Template for Java

class Solution {
    public int countWords(String list[], int n) {
        // code< here
       
        HashMap<String,Integer> group=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            
          group.put(list[i],group.getOrDefault(list[i],0)+1);
        }
        int count=0;
        for(Map.Entry<String,Integer> entry:group.entrySet())
        {
            if(entry.getValue()==2)
            {
                count++;
            }
        }
        return count;
    }
    
}