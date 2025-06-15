class Solution {
    static int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer> group=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            group.put(arr[i],group.getOrDefault(arr[i],0)+1);
            
        }
        for(Map.Entry<Integer,Integer> entries:group.entrySet() )
        {
            
            
                if(entries.getValue()>arr.length/2)
                {
                   return entries.getKey();
                }
            
        }
        return -1;
    }
}