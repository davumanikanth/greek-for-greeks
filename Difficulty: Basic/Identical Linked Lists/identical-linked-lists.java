/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node head1, Node head2) {
        // write your code here
        int val1=getsize(head1);
        int val2=getsize(head2);
        if(val1!=val2)
        {
            return false;
        }
        int[] first=new int[val1];
        int index=0;
        int[] second=new int[val2];
        int index1=0;
        Node current=head1;
        while(current!=null)
        {
            first[index++]=current.data;
            current=current.next;
        }
        Node current1=head2;
        while(current1!=null)
        {
            second[index1++]=current1.data;
            current1=current1.next;
        }
        for(int i=0;i<index;i++)
        {
            if(first[i]!=second[i])
            {
                return false;
            }
        }
        return true;
        
    }
    public int getsize(Node head)
    {
        int count=0;
        Node current=head;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        return count;
    }
}