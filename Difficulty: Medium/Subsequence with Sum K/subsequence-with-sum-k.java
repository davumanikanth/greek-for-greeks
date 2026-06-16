class Solution {
    public static boolean checkSubsequenceSum( int[] arr, int K) {
        // code here
        boolean res = ans(0,0,arr.length,arr,K);
        return res;
       
        
    }
    
    
    public static boolean ans(int index,int sum,int N, int[] arr, int K){
        
        if(sum>K){
            return false;
        }
        if(sum==K){
            return sum==K;
        }
        if(index>=N){
            return false;
        }
        
        if(ans(index+1,sum+arr[index],N,arr,K)){
            return true;
        }
        if(ans(index+1,sum,N,arr,K)){
            return true;
        }
        
        return false;
        
        
        
        
            }
}