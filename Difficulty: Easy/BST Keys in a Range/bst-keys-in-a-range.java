class Solution {
    // Function to return a list of BST elements in a given range.
    public static ArrayList<Integer> printNearNodes(Node node, int low, int high) {
        // code here.
        ArrayList<Integer> group=new ArrayList<>();
        inorder(node,low,high,group);
        return group;
    }
    public static void inorder(Node root,int low,int high,ArrayList<Integer>group)
    {
        if(root==null) return;
        inorder(root.left,low,high,group);
        if((root.data>=low) &&(root.data<=high))
        {
            group.add(root.data);
            
        }
        inorder(root.right,low,high,group);
    }
}
