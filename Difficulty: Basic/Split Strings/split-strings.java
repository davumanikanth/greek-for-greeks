// User function Template for Java

class Solution {
    static List<String> splitString(String S) {
        // code here
        StringBuilder word=new StringBuilder();
        StringBuilder number=new StringBuilder();
        StringBuilder other=new StringBuilder();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(Character.isLetter(ch))
            {
                word.append(ch);
                
            }
            else if(Character.isDigit(ch))
            {
                number.append(ch);
                
            }
            else
            {
                other.append(ch);
            }
        }
        List<String> group=new ArrayList<>();
        if(word.length()==0)
        {
            group.add("-1");
        }
        else
        {
        group.add(word.toString());
        }
        if(number.length()==0)
        {
            group.add("-1");
        }
        else
        {
        group.add(number.toString());
        }
        if(other.length()==0)
        {
            group.add("-1");
        }
        else
        {
        group.add(other.toString());
        }
        return group;
    }
}
