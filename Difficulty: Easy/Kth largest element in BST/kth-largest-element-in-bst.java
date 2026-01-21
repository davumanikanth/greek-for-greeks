/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    int count=0;
    int result=0;
    public int kthLargest(Node root, int k) {
        // Your code here
        count=k;
        postorder(root);
        return result;
        
        
    }
    public void postorder(Node node)
    {
        if(node==null) return;
        postorder(node.right);
        count--;
        if(count==0)
        {
            result=node.data;
        }
        postorder(node.left);
    }
}