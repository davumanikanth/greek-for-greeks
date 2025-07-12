// User function Template for Java

class Sol {
    Boolean balancedNumber(String N) {
        // your code here
        int mid=N.length()/2;
        String first=N.substring(0,mid);
        String second=N.substring(mid+1);
        int firstsum=0;
        int secondsum=0;
        for(int i=0;i<mid;i++)
        {
            char ch=first.charAt(i);
            firstsum+=first.charAt(i)-'0';
            secondsum+=second.charAt(i)-'0';
            
        }
        if(firstsum==secondsum)
        {
            return true;
        }
        return false;
    }
}