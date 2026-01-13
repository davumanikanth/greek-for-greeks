class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
         PriorityQueue<Integer> T=new PriorityQueue<>();
    PriorityQueue<Integer> P=new PriorityQueue<>();
      
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]=='P')
        {
            P.add(i);
        }
        else
        {
            T.add(i);
        }
    }
    
    int thieves=0;
    while(!T.isEmpty() && !P.isEmpty())
    {
        int a=P.peek();
        int b=T.peek();
        if(Math.abs(a-b)<=k)
        {
           T.poll();
           P.poll();
           thieves++;
        }
        else
        {
           if(a>b)
           {
               T.poll();
           }
           else
           {
               P.poll();
           }
        }
    }
    
    return thieves;
    }
}