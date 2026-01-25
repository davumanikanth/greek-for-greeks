/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    Node pre=null;
    Node succ=null;
    Node prev=null;
    public ArrayList<Node> findPreSuc(Node node, int key) {
        // code here
        inorder(node,key);
        ArrayList<Node> group=new ArrayList<>();
        group.add(pre);
        group.add(succ);
        return group;
    }
    public void inorder(Node root,int key)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left,key);
        if(root.data<key)
        {
            pre=root;
        }
        else if( root.data>key && succ==null)
        
        {
            succ=root;
        
        }
        prev=root;
        
        inorder(root.right,key);
        
        
        
        
    }
}