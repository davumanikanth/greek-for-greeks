class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int n=arr.length;
        if(n<k) return -1;
        // int sum=0;
       
        // int maxxor=Integer.MIN_VALUE;
        // for(int i=0;i<=n-k;i++)
        // {
        //     int sumxor=0;
        //     for(int j=i;j<i+k;j++)
        //     {
        //       sumxor^=arr[j]; 
              
        //     }
        //     maxxor=Math.max(maxxor,sumxor);
        // }
        // return maxxor;
        int[] pre=new int[arr.length];
        int n1=arr.length;
        pre[0]=arr[0];
        for(int i=1;i<n1;i++)
        {
            pre[i]=arr[i]^pre[i-1];
        }
        int maxxor=pre[k-1];
        for(int i=k;i<n1;i++)
        {
            
            int currsum=pre[i]^pre[i-k];
                        maxxor=Math.max(maxxor,currsum);

        }
        return maxxor;
     }
}
