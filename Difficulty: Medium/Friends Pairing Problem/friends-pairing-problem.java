class Solution {

    public int countFriendsPairings(int n) {

        if (n == 0 || n == 1)
            return 1;

        if (n == 2)
            return 2;

        return countFriendsPairings(n - 1)
                + (n - 1) * countFriendsPairings(n - 2);
    }
}