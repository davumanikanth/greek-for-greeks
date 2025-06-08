// User function Template for Java

class Solution {
    public String removeConsonants(String s) {
        // code here.
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++)

{
    char ch=s.charAt(i);
    if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
    {
        result.append(ch);
    }
    
} 
if(result.length()==0)
    {
        return "No Vowel";
    }
   
return result.toString();
        
    }
}
