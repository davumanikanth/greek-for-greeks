class Solution {
    public boolean canServe(int[] arr) {
        // code here
     HashMap<Integer,Integer> group=new HashMap<>();
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]==5)
         {
             group.put(arr[i],group.getOrDefault(arr[i],0)+1);
             
         }
         if(arr[i]==10)
         {
             if(group.containsKey(5))
             {
                group.put(5,group.get(5)-1);
                 if(group.get(5)==0)
                 {
                 group.remove(5);
                 }

             }
             else 
             {
                 return false;
                 
             }
             
              group.put(arr[i],group.getOrDefault(arr[i],0)+1);
         }
         if(arr[i]==20)
         {
             if(group.containsKey(5) && group.containsKey(10))
             {
                group.put(5,group.get(5)-1);
                 group.put(10,group.get(10)-1);
                 if(group.get(5)==0)
                 {
                 group.remove(5);
                 }
                  if(group.get(10)==0)
                 {
                 group.remove(10);
                 }

             }
             else if (group.getOrDefault(5, 0) >= 3) {
                    group.put(5, group.get(5) - 3);
                    if (group.get(5) == 0) group.remove(5);
             }
             else 
             {
                 return false;
                 
             }
              
         }
     }
     return true;
    }
}