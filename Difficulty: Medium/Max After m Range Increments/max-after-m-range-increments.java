class Solution {
    public int findMax(int n, int[] a, int[] b, int[] k) {
        // code here
        int[] arr=new int[n];
        for(int i=0;i<a.length;i++)
        {
            int f1=a[i];
            int f2=b[i];
            int f3=k[i];
             if(f1<n)
             {
                 arr[f1]+=f3;
             }
             if(f2+1<n)
             {
                 arr[f2+1]-=f3;
             }
            
        }
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            max=Math.max(sum,max);
            
        }
        return max;
    }
}
