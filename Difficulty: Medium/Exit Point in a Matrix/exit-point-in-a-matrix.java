class Solution {

    public List<Integer> exitPoint(int[][] mat) {

        int i=0,j=0,dir=1,m=mat.length,n=mat[0].length;

        while(i>=0&&i<m&&j>=0&&j<n){

            if(mat[i][j]==1){

                mat[i][j]=0;

                dir=(dir%4)+1;

            }

            if(dir==1)j++;

            else if(dir==2)i++;

            else if(dir==3)j--;

            else

            i--;

        }

       if(dir==1) j--;

       else if(dir==2)i--;

       else if(dir==3)j++;

       else

       i++;

       ArrayList<Integer>ans=new ArrayList<>();

       ans.add(i);ans.add(j);

       return ans;

    }

}

