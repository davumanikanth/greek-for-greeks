// User function template for Java
class Solution {
    static String javaSub(String S, int L, int R) {
        // code here
        String result="";
         if(L>=0 && R <=S.length())
            {
        for(int i=L;i<=R;i++)
        {
            char ch=S.charAt(i);
              result=result+ch;
            
        }
            }
        return result;
    }
}