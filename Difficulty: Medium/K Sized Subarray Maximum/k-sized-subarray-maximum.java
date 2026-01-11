class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        TreeMap<Integer,Integer> group=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<k;i++)
        {
            group.put(arr[i],group.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> f=new ArrayList<>();
        f.add(group.firstKey());
        for(int i=k;i<arr.length;i++)
        {
            group.put(arr[i-k],group.get(arr[i-k])-1);
            if(group.get(arr[i-k])==0)
            {
                group.remove(arr[i-k]);
            }
            group.put(arr[i],group.getOrDefault(arr[i],0)+1);
            f.add(group.firstKey());
            
        }
        return f;
        
    }
}