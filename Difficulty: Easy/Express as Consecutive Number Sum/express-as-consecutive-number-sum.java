class Solution {
    public boolean isSumOfConsecutive(int n) {
        return n > 1 && (n & (n - 1)) != 0;
    }
}