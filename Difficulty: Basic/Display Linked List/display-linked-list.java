// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}*/

class Get {
    public static ArrayList<Integer> displayList(Node head) {
        // Your code here
        Node current=head;
        ArrayList<Integer> group=new ArrayList<>();
        while(current!=null)
        {
            group.add(current.data);
            current=current.next;
        }
        return group;
    }
}