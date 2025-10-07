/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
   
    public static int findMax(Node root) {
        // code here
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
        int leftval=findMax(root.left);
        int rightval=findMax(root.right);
        return Math.max(root.data,Math.max(leftval,rightval));
        
        
    }
  
   






 


 public static int findMin(Node root) {
        
        // code here
         if(root==null)
        {
            return Integer.MAX_VALUE;
        }
        int leftval=findMin(root.left);
        int rightval=findMin(root.right);
        return Math.min(root.data,Math.min(leftval,rightval));
        
       
    }
}