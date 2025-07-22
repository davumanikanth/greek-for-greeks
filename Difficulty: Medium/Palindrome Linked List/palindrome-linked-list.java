/* Structure of class Node is
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    // Function to check whether the list is palindrome.
    static boolean isPalindrome(Node head) {
        // Your code here
        Node current=head;
        List<Integer> result=new ArrayList<>();
        while(current!=null)
        {
            result.add(current.data);
            current=current.next;
        }
       
        
        int left=0;
        int right=result.size()-1;
        while(left<right)
        {
            if(!result.get(left).equals(result.get(right)))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}