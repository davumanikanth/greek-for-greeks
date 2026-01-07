class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
      ArrayList<Integer> fuck=new ArrayList<>();
      HashMap<Integer,Integer> group=new HashMap<>();
    //   for(int i=0;i<=arr.length-k;i++)
    //   {
    //       HashSet<Integer> group=new HashSet<>();
    //       for(int j=i;j<i+k;j++)
    //       {
    //           group.add(arr[j]);
               
    //       }
    //       fuck.add(group.size());
           
    //   }
    int n=arr.length;
    
    for(int i=0;i<k;i++)
    {
        group.put(arr[i],group.getOrDefault(arr[i],0)+1);
    }
    fuck.add(group.size());
    
    for(int i=k;i<n;i++)
    {
      
     group.put(arr[i-k],group.get(arr[i-k])-1);
      if(group.get(arr[i-k])==0)
      {
          group.remove(arr[i-k]);
      }
      
      
      group.put(arr[i],group.getOrDefault(arr[i],0)+1);
      fuck.add(group.size());
      
      
        
    }
    
       return  fuck;
    }
}