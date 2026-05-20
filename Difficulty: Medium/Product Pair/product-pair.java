class Solution {
    public boolean isProduct(int[] arr, long target) {

        HashSet<Long> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            // Special case for target = 0
            if (arr[i] == 0) {
                if (target == 0) {
                    return true;
                }
                continue;
            }

            // Check divisibility first
            if (target % arr[i] == 0) {

                long needed = target / arr[i];

                if (set.contains(needed)) {
                    return true;
                }
            }

            set.add((long) arr[i]);
        }

        return false;
    }
}