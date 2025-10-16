/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    // Function to return sum of all nodes of a binary tree
    static int sumBT(Node root) {
        // Your code here
        if(root==null)
        {
            return 0;
        }
        
        int leftsum=sumBT(root.left);
        int rightsum=sumBT(root.right);
        int sum=root.data+leftsum+rightsum;
        return sum;
    }
}