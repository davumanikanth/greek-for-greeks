/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node newnode=new Node(x);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
            newnode.next=null;
           
        }
         return head;
        
    }
}