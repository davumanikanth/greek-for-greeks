/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        ArrayList<Integer> group=new ArrayList<>();
        while(!q.isEmpty())
        {
            int level=q.size();
            ArrayList<Integer> sub=new ArrayList<>();
            for(int i=0;i<level;i++)
            {
                Node rem=q.poll();
                sub.add(rem.data);
                if(rem.left!=null)
                {
                    q.offer(rem.left);
                }
                if(rem.right!=null)
                {
                    q.offer(rem.right);
                }
                
                
            }
            group.add(sub.get(0));
        }
        return group;
        
    }
}