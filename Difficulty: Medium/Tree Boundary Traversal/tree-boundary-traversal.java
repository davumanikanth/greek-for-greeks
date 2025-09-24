/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isLeaf(Node node)
    {
        if(node.left==null && node.right==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void addleftboundary(Node node,List<Integer> result)
    {
        Node curr=node.left;
        while(curr!=null)
        {
            if(isLeaf(curr)==false) result.add(curr.data);
            if(curr.left!=null) curr=curr.left;
            else curr=curr.right;
        }
    }
    public void addleafnode(Node node,List<Integer> result)
    {
        if(isLeaf(node))
        {
            result.add(node.data);
            return ;
        }
        if(node.left!=null) addleafnode(node.left,result);
        if(node.right!=null) addleafnode(node.right,result);
        
    }
    public void addrightboundary(Node node,ArrayList<Integer> result)
    {
        Node curr=node.right;
        ArrayList<Integer> temp=new ArrayList<>();
        while(curr!=null)
        {
        if(isLeaf(curr)==false) temp.add(curr.data);
        if(curr.right!=null) curr=curr.right;
        else curr=curr.left;
        }
        for(int i=temp.size()-1;i>=0;i--)
        {
            result.add(temp.get(i));
        }
    }
        
    public ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        
        if(node==null)
        {
            return result;
        }
        if(isLeaf(node)==false) result.add(node.data);
        addleftboundary(node,result);
        addleafnode(node,result);
        addrightboundary(node,result);
        return result;
    
    
        
        
        
        }
}