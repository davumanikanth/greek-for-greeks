class Solution {
    static ArrayList<Integer> leaders(int nums[]) {
        // code here
       int  n=nums.length;
       int leader=nums[n-1];
       ArrayList<Integer> result=new ArrayList<>();
       result.add(leader);
       for(int i=n-2;i>=0;i--)
       {
           if(nums[i]>=leader)
           {
               leader=nums[i];
               result.add(leader);
           }
       }
       Collections.reverse(result);
       return result;
}
}
