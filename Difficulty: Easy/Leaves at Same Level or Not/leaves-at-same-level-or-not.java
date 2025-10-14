/* A Binary Tree node
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
    boolean check(Node root) {
        // Your code here
        ArrayList<Integer> g1=new ArrayList<>();
        helper(root,g1);
         Queue<Node> queue=new LinkedList<>();
        List<List<Integer>> group=new ArrayList<List<Integer>>();
        if(root==null)
        {
            return false;
        }
        queue.add(root);
        while(!queue.isEmpty())
        {
            int level=queue.size();
            List<Integer> sublist=new LinkedList<>();
            for(int i=0;i<level;i++)
            {
               Node rem=queue.remove();
                sublist.add(rem.data);
                if(rem.left!=null)
                {
                    queue.add(rem.left);
                }
                if(rem.right!=null)
                {
                    queue.add(rem.right);
                    
                }


            }
            group.add(sublist);

        }
        if(group.get(group.size()-1).equals(g1))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public void helper(Node node,ArrayList<Integer> group)
    {
        if(node==null)
        {
            return ;
        }
        if(node.left==null && node.right==null)
        {
            group.add(node.data);
        }
        helper(node.left,group);
        helper(node.right,group);
    }
    
}