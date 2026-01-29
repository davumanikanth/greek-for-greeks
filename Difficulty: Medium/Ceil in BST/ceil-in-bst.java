/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Solution {
    int number=-1;
    int findCeil(Node root, int x) {
        // code here
        inorder(root,x);
        return number;
    }
    public void inorder(Node node,int x)
    {
        if(node==null) return;
        inorder(node.left,x);
        if(node.data>=x && number==-1)
        {
            number=node.data;
            return;
        }
        inorder(node.right,x);
        
    }
}