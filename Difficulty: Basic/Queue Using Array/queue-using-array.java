class MyQueue {

    int front, rear;
    int arr[] = new int[100005];

    MyQueue() {
        front = 0;
        rear = 0;
    }

    // Function to push an element x in a queue.
    void push(int x) {
        // Your code here
       if(rear==100005-1)
       {
           return ;
       }
       
       arr[rear]=x;
       rear++;
        
    }

    // Function  to pop an element from queue and return that element.
    int pop() {
        if( front==rear)
        {
            return -1;
        }
        
        int removed=arr[front];
        front++;
        return removed;
        
        // Your code here
    }
}