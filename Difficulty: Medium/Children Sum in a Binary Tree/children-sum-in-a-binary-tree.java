/*
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Solution {
    public boolean isSumProperty(Node root) {
        //  code here
        if(root==null || (root.left==null && root.right==null))
        {
            return true;
        }
        int leftvalue;
        if(root.left!=null)
        {
            leftvalue=root.left.data;
        }
        else
        {
            leftvalue=0;
        }
        int rightvalue;
        if(root.right!=null)
        {
            rightvalue=root.right.data;
        }
        else
        {
            rightvalue=0;
        }
        
        
        if(root.data==leftvalue+rightvalue)
        {
            return isSumProperty(root.right) && isSumProperty(root.left);
        }
        else
        {
            return false;
        }
    }
}