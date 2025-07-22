// function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node current=head;
        List<Integer> list=new ArrayList<>();
        
        while(current!=null)
        {
            list.add(current.data);
            current=current.next;
        }
     
     Node head1=null;
            Node tail=null;
        for(int i=list.size()-1;i>=0;i--)
        {
            
            Node newnode=new Node(list.get(i));
            if(head1==null)
            {
                head1=newnode;
                tail=newnode;
            }
            else
            {
                //we are going to insert at the end;
                tail.next=newnode;
                tail=newnode;
            }
            
        }
        return head1;
        
    }
}