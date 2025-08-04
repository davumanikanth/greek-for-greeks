class MyStack {

    private int[] oper;
    private int top;
    public MyStack()
    {
        oper=new int[1000];
        top=-1;
    }
    public void push(int x) {
        // code here
    
         
         top++;
         oper[top]=x;
    }

    public int pop() {
        if(top==-1)
        {
            return -1;
            
        }
        
        int x=oper[top];
        top--;
        return x;
        
        // code here
    }
}
