/*
The structure of linked list is the following

class Node
{
int data;
Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    // Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head) {
        // add your code here
         List<Integer> group=new ArrayList<>();
     Node current=head;
        while(current!=null)
        {
            group.add(current.data);
            current=current.next;
        }
        Collections.sort(group);
     Node head1=null;
     Node tail=null;
        for(int num:group)
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