/*class Node
{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/

// function should return the count of total number of non leaf nodes in the tree.
class Solution {
    int countNonLeafNodes(Node root) {
        // code here
       
        Queue<Node > q=new LinkedList<>();
         q.add(root);
         int count=0;
         while(!q.isEmpty())
         {
             int level=q.size();
             
             for(int i=0;i<level;i++)
             {
                              Node curr=q.remove();

                 if(curr.left!=null || curr.right!=null)
                 {
                     count++;
                    
                 }
                 if(curr.left!=null)
                 {
                     q.add(curr.left);
                 }
                 if(curr.right!=null)
                 {
                     q.add(curr.right);
                 }
             }
         }
         return count;
    }
}