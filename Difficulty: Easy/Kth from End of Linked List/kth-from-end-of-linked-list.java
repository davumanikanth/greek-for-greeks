/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node current=head;
        int count=0;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        if(k>count)
        {
            return -1;
        }
        int result=count-k+1;
        Node current1=head;
        int count1=0;
        int value=0;
        while(current1!=null)
        
        {
            count1++;
            if(count1==result)
            {
               value = current1.data; 
            }
            current1=current1.next;
        }
        
        return value;
    }
    
}