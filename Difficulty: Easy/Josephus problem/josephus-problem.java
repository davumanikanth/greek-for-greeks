class Solution {
    public int josephus(int n, int k) {
        // code here
        int ans = 0; // 0-indexed
    for (int i = 2; i <= n; i++) {
        ans = (ans + k) % i;
    }
    return ans + 1;
    }
}