// User function Template for Java

/*
class Node {
    int data;
    Node left, right;
    Node(int key){
        this.data = key;
        this.left = this.right = null;
    }
}
*/

class Tree {
    int count=0;
    int sum=0;
    int sum(Node root, int k) {
          count=k;
          inorder(root);
          return sum;
        // Code here
        
        
    }
    public void inorder(Node node)
    {
        if(node==null) return;
        inorder(node.left);
        count--;
        if(count>=0)
        {
            sum+=node.data;
        }
        if(count<0) return;
        inorder(node.right);
    }
}