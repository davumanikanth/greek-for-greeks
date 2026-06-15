import java.util.*;

class Solution {
public ArrayList<Integer> constructList(int[][] queries) {


    ArrayList<Integer> ans = new ArrayList<>();
    ans.add(0); // Initial array contains 0

    int xor = 0;

    for (int[] q : queries) {

        if (q[0] == 0) {
            // Store value adjusted with current XOR
            ans.add(q[1]^xor );
        } else {
            // Update global XOR
            xor ^= q[1];
        }
    }

    // Apply final XOR to all elements
    for (int i = 0; i < ans.size(); i++) {
        ans.set(i, ans.get(i) ^ xor);
    }

    Collections.sort(ans);
    return ans;
}


}
