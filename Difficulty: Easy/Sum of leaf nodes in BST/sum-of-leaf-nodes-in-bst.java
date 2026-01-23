/*node class of the binary ssearch tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class Solution {
    static int sum;
    public static int sumOfLeafNodes(Node root) {
        // code here
         sum=0;
       inorder(root);
       return sum;
        
        
    }
    public static void inorder(Node node)
    {
        if(node==null)
        {
            return;
        }
        inorder(node.left);
        if(leaf(node))
        {
            sum+=node.data;
        }
        inorder(node.right);
    }
    
    public static boolean leaf(Node node)
    {
        if(node.left==null && node.right==null)
        {
            return true;
        }
        return false;
    }
}