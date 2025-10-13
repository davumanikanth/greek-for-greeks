/*  A Binary Tree nodea
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
class Tree {
    ArrayList<Integer> noSibling(Node root) {
        // code here
        ArrayList<Integer> group=new ArrayList<>();
        
        if(root==null)
        {
            group.add(-1);
            return group;
        }
        helpers(root,group);
        if(group.size()==0)
        {
            group.add(-1);
            return group;
        }
        Collections.sort(group);
        return group;
     
    }
    public void helpers(Node root,ArrayList<Integer> group)
    {
        if(root==null)
        {
           return ;
        }
        if(root.left!=null && root.right==null )
        {
            group.add(root.left.data);
        }
        if(root.right!=null && root.left==null )
        {
            group.add(root.right.data);
        }
        helpers(root.left,group);
        helpers(root.right,group);
    }
    
}