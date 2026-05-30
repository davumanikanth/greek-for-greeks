class TreeNode {
    TreeNode[] children = new TreeNode[26];
}

class Solution {

    int countSubs(String s) {

        TreeNode root = new TreeNode();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            TreeNode node = root;
            for (int j = i; j < s.length(); j++) {
                int idx = s.charAt(j) - 'a';

                if (node.children[idx] == null) {
                    node.children[idx] = new TreeNode();
                    count++;
                }
                node = node.children[idx];
            }
        }
        return count ;
    }
}