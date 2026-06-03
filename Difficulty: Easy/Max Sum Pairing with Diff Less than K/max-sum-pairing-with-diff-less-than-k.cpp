class Solution {
  public:
    int sumDiffPairs(vector<int>& arr, int k) {
        // code here
        sort(arr.begin(), arr.end());
        int ans= 0;
        int i= arr.size()-1;
        while(i>0){
            if(arr[i]- arr[i-1] < k){
                ans= ans+ arr[i] + arr[i-1];
                i= i-2;
            }
            else{
                i=i-1;
            }
        }
        return ans;
    }
};