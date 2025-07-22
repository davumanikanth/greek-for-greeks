// User function Template for Java

class Sol {
    public static int search(int n, int arr[]) {
        // your code here
        int xor=0;
        for(int i=0;i<arr.length;i++)
        {
            xor=xor^arr[i];
        }
        return xor;
    }
}