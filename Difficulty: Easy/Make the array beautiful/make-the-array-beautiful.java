class Solution {
    List<Integer> makeBeautiful(int[] arr) {
        
        // code here
        List<Integer> group=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
        if(group.size()!=0 &&(( group.get(group.size()-1)>=0 &&  
        arr[i] <0) ||(group.get(group.size()-1)<0 && arr[i]>=0)))
        {
            group.remove(group.size()-1);
        }
        else
        {
            group.add(arr[i]);
        }
        }
        return group;
        
        
        
    }
}