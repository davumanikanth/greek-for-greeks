/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        Set<Integer> result=new LinkedHashSet<>();
        Node curr1=head;
        while(curr1!=null)
        {
            result.add(curr1.data);
            curr1=curr1.next;
        }
        Node head1=null;
       Node tail=null;
        for(int num:result)
       {
         Node newnode=new Node(num);
           if(head1==null)
           
           {
            head1=newnode;
            tail=newnode;


           }
           else
           {
            tail.next=newnode;
            tail=newnode;
           }
       }
       return head1;
    }
}