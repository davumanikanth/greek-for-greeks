
class Solution {
    public String average(int arr[]) {
        // code here
        int num=arr.length;
        long avg=0;
        
        for(int i=0;i<arr.length;i++)
        {
            avg=avg+arr[i];
        }
        double sum=(double)avg/num;
        return String.format("%.2f",sum);
    }
}