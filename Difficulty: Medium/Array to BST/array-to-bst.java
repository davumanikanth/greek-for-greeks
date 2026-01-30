/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    public Node sortedArrayToBST(int[] arr) {
        // code here 
        return bianry(arr,0,arr.length-1);
    }
    public Node bianry(int[] num,int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid=(start+end)/2;
        Node tree=new Node(num[mid]);
        tree.left=bianry(num,start,mid-1);
        tree.right=bianry(num,mid+1,end);
        return tree;
    }
}