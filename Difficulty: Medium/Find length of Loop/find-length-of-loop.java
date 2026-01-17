/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/


class Solution {
    public int sizeofloop(Node n)
    {
        int count=1;
        Node curr=n;
        while(n.next!=curr)
        {
            count++;
            n=n.next;
        }
        return count;
    }
    public int lengthOfLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return sizeofloop(slow);
            }
            
        }
        return 0;
    }
}