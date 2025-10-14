/*
class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int nodeSum(Node root, int l, int r) {
        // code here
        int sum=0;
         Queue<Node> queue=new LinkedList<>();
        List<List<Integer>> group=new ArrayList<List<Integer>>();
        if(root==null)
        {
            return 0;
        }
        queue.add(root);
        while(!queue.isEmpty())
        {
            int level=queue.size();
            List<Integer> sublist=new LinkedList<>();
            for(int i=0;i<level;i++)
            {
               Node rem=queue.remove();
                  if(rem.data>=l && rem.data<=r)
                  {
                      sum+=rem.data;
                  }
                if(rem.left!=null)
                {
                    queue.add(rem.left);
                }
                if(rem.right!=null)
                {
                    queue.add(rem.right);
                    
                }


            }
            

        }
        return sum;
    }
}
