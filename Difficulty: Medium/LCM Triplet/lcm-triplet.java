class Solution {
    int lcmTriplets(int n) {
        // code here
        int value=0;
        if(n<3)
        {
          return n;  
        }
        else if(n%2!=0)
        {
            value=n*(n-1)*(n-2);
            
        }
        else if(n%3!=0)
        {
            value=n*(n-1)*(n-3);
        }
        else 
        {
            value=(n-1)*(n-2)*(n-3);
        }
        return value;
    }
}