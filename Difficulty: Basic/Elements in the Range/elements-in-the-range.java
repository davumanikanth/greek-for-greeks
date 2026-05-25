class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        HashSet<Integer> group=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=start && arr[i]<=end)
            {
                group.add(arr[i]);
            }
        }
        if(group.size()==end-start+1) return true;
        else return false;
    }
}