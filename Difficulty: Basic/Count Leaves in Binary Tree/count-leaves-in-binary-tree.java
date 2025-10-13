/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    int countLeaves(Node node) {
        // Your code
       if(node==null)
       {
           return 0;
           
       }
       if(node.left==null && node.right==null)
       {
           return 1;
       }
       
       int leftvalue=countLeaves(node.left);
       int rightvalue=countLeaves(node.right);
       return  leftvalue+rightvalue;
    }
}