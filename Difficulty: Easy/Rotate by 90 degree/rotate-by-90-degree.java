// User function Template for Java

class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][]) {
        // code here
        int n=matrix.length;
        int[][] ans=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                ans[n-1-j][i]=matrix[i][j];
                
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=ans[i][j];
            }
        }
    }
}