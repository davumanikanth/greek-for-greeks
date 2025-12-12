class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashMap<Integer,Integer> group=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            group.put(arr[i],group.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> group1=new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> entry:group.entrySet())
        {
            if(entry.getValue()>1)
            {
              group1.add(entry.getKey());  
            }
        }
        return group1;
    }
}