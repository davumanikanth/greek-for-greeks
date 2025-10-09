/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> group=new ArrayList<>();
        if(root==null)
        {
            return group;
        }
        helper(root,group);
        return group;
        
    }
    public void helper(Node tree,ArrayList<Integer> group)

    {
        if(tree==null)
        {
            return;
        }
        helper(tree.left,group);
        helper(tree.right,group);
        group.add(tree.data);
    }
}