/* Structure of the node*/
/* class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
} */

class Solution {
    Node mergeResult(Node node1, Node node2) {
        // Your code here
       Node curr1=node1;
       List<Integer> result=new ArrayList<>();

       while(curr1!=null) 
       {
         result.add(curr1.data);
         curr1=curr1.next;
       }
       Node curr2=node2;
       while(curr2!=null)
       {
        result.add(curr2.data);
        curr2=curr2.next;
       }
       
       Collections.sort(result,Collections.reverseOrder());
       Node head=null;
       Node tail=null;
       for(int num: result)
       {
           Node newnode=new Node(num);
           if(head==null)
           
           {
            head=newnode;
            tail=newnode;


           }
           else
           {
            tail.next=newnode;
            tail=newnode;
           }
       }
       return head;
    }
}