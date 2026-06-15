


// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        int sum=0;
        ArrayList<Integer> group=new ArrayList<>();
        f(0,arr,sum,group);
        Collections.sort(group);
        return group;
    }
    public void f(int index,int[] arr,int sum,ArrayList<Integer> group)
    {
        if(index==arr.length)
        {
            group.add(sum);
            return;
            
        }
        f(index+1,arr,sum+arr[index],group);
        f(index+1,arr,sum,group);
    }
}