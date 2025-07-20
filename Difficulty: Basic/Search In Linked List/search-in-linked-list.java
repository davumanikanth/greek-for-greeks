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
}
*/

class Solution {
    public static boolean searchLinkedList(Node head, int x) {
        // Your code here
        Node current=head;
        while(current!=null)
        {
            if(x==current.data)
            {
                return true;
                
            }
            current=current.next;
        }
        return false;
    }
}