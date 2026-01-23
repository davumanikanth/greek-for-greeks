/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> getSortedOrder(Node node) {
        // Code here
        ArrayList<Integer> group=new ArrayList<>();
        inorder(node,group);
        return group;
    }
    public void inorder(Node root,ArrayList<Integer> group)
    {
        if(root==null) return;
        inorder(root.left,group);
        group.add(root.data);
        inorder(root.right,group);
    }
}