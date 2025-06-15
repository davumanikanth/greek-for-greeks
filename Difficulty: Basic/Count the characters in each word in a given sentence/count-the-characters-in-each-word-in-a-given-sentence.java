// User function Template for Java

class Solution {
    ArrayList<Integer> countChars(String s) {
        // code here
        String[] words=s.split("\\s+");
        ArrayList<Integer> value=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            value.add(words[i].length());
        }
        return value;
    }
}
