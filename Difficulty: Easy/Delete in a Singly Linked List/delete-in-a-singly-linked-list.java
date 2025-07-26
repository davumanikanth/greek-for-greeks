/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(x==1)
        {
            head=head.next;
        }
        else
        {
            Node prev=null;
            Node curr=head;
            for(int i=1;i<x && curr!=null;i++)
            {
                prev=curr;
                curr=curr.next;
                
                
            }
            if(curr!=null)
            {
                prev.next=curr.next;
                curr=null;
                
                
            }
            else
            {
                System.out.println("Index out of bound");
            }
            
        }
        return head;
    }
}












