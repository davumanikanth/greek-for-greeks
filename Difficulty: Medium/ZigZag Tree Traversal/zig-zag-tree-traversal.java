/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        Queue<Node> q=new LinkedList<>();
        ArrayList<Integer> group=new ArrayList<>();
        q.offer(root);
        int count=0;
        while(!q.isEmpty())
        {
            ArrayList<Integer> g=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node rem=q.poll();
                g.add(rem.data);
                if(rem.left!=null)
                {
                    q.offer(rem.left);
                }
                if(rem.right!=null)
                {
                    q.offer(rem.right);
                }
                
            }
            if(count%2!=0)
            {
                Collections.reverse(g);
                group.addAll(g);
            }
            else
            {
                group.addAll(g);
            }
            count++;
            
        }
        return group;
    }
}