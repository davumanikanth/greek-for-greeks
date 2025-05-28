class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        // code here
        ArrayList<Integer> spiral=new ArrayList<>();
        int top=0;
        int bottom=matrix.length-1;//which indicates the row;
        int left=0;
        int right=matrix[0].length-1;
        while(left<=right && top<= bottom)
        {
            for(int i=left;i<=right;i++)
            {
                spiral.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                spiral.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom)
            {
            for(int i=right;i>=left;i--)
            {
                spiral.add(matrix[bottom][i]);
            }
            
            bottom--;
            }
            if(left<=right)
            {
            for(int i=bottom;i>=top;i--)
            {
                spiral.add(matrix[i][left]);
            }
            left++;
            }

        }
        return spiral;
        
        }
}
