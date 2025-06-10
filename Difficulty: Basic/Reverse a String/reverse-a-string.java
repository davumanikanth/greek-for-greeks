class Solution {
    static String revStr(String s) {
        // code here
        return  new StringBuilder(s).reverse().toString();
        
    }
}
// class Solution {
//     static String revStr(String s) {
//         // code here
//         String result="";
//         for(int i=s.length()-1;i>=0;i--)
//         {
//             char ch=s.charAt(i);
//             result=result+ch;
//         }
//         return result;
//     }
// }