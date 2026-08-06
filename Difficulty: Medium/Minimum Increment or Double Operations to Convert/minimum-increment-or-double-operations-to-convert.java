class Solution {
    public int countMinOperations(int arr[]) {
        // code here
        int count=0;
        while(true)
        {
          int allzero=0;
            boolean odd=false;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==0) allzero++;
                if(arr[i]%2!=0) odd=true;
                
            }
            if(allzero==arr.length) break;
            if(odd==true)
            {
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i]%2!=0)
                    {
                        arr[i]--;
                                            count++;

                    }
                    
                }
                
            }
            else
            {
                for(int i=0;i<arr.length;i++)

                  {
                     arr[i]=arr[i]/2;
                  }
                  count++;
         }
            
        }
        return count;
        
        
    }
}