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
class Pair
{
    Node node;
    int hd;
    public Pair(Node node,int hd)
    {
        this.node=node;
        this.hd=hd;
    }
}
class Solution {
    public ArrayList<Integer> topView(Node root) {
        // code here
        Queue<Pair> q=new LinkedList<Pair>();
        ArrayList<Integer> result=new ArrayList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            int divison=p.hd;
            Node temp=p.node;
            if(map.get(divison)==null) map.put(divison,temp.data);
            if(temp.left!=null) q.offer(new Pair(temp.left,divison-1));
            if(temp.right!=null) q.offer(new Pair(temp.right,divison+1));
        }
        
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            result.add(entry.getValue());
        }
        return result;
        
        
    }
}














