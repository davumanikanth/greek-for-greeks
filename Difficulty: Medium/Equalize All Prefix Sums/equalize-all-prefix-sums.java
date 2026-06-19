class Solution {
    public ArrayList<Integer> optimalArray(int[] arr) {
        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);

        long prev = 0;

        for (int i = 1; i < n; i++) {
            prev += arr[i] - arr[i / 2];
            ans.add((int) prev);
        }

        return ans;
    }
}