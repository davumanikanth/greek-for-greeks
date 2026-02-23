class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> set=new TreeSet<>();
        for(int num:a)
        {
            set.add(num);
        }
        for(int num1:b)
        {
            set.add(num1);
        }
        return new ArrayList<>(set);
    }
}