class Solution {
    public Node removeAllDuplicates(Node head) {
        // code here
        if(head==null) return head;
        Node current=head;
        HashMap<Integer,Integer> group=new LinkedHashMap<>();
        while(current!=null)
        {
            group.put(current.data,group.getOrDefault(current.data,0)+1);
            current=current.next;
        }
        StringBuilder res=new StringBuilder();
        Node head1=null;
        Node tail=null;
        for(Map.Entry<Integer,Integer> entry:group.entrySet())
        {
            if(entry.getValue()==1)
            {
            
            Node newnode=new Node(entry.getKey());
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

        }
        return head1;
    }
}