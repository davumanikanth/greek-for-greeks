class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        int n=arr.length;
        int result=0;
        HashMap<Integer,Integer> group=new HashMap<>();
        int left=0;
        for(int right=0;right<arr.length;right++)
        {
            group.put(arr[right],group.getOrDefault(arr[right],0)+1);
            while(group.size()>k)
            {
                group.put(arr[left],group.get(arr[left])-1);
                if(group.get(arr[left])==0)
                {
                    group.remove(arr[left]);
                }
                left++;
            }
            result+=right-left+1;
        }
        return result;
    }
}
