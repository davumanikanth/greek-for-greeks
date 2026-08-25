class Solution {
    public int minMoves(int[] arr) {

        int n = arr.length;

        int[] pos = new int[n + 1];

        // Store position of every value
        for (int i = 0; i < n; i++) {
            pos[arr[i]] = i;
        }

        int maxLen = 1;
        int currLen = 1;

        // Find longest consecutive values already in correct order
        for (int x = 1; x < n; x++) {
            if (pos[x] < pos[x + 1]) {
                currLen++;
            } else {
                currLen = 1;
            }

            maxLen = Math.max(maxLen, currLen);
        }

        return n - maxLen;
    }
}