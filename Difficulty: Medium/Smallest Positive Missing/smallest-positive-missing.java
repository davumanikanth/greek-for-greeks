class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int min=1;
        int max=0;
        int index=0;
        Set<Integer> result=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]<0)
           {
               continue;
           }
           else
           {
           
               max=Math.max(max,arr[i]);
               result.add(arr[i]);
           }
        }
        
        for(int i=1;i<=max+1;i++)
        {
            if(!result.contains(i))
            {
               return i;
            }
            
        }
        return -1;
    }
}
