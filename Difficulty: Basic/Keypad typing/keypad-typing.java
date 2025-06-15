// User function Template for Java
class Solution {
    // Function to find matching decimal representation of a string as on the keypad.
    public static String printNumber(String s, int n) {
        // Your code here
        StringBuilder result=new StringBuilder();
        for(int i=0;i<n;i++)
        {
           char ch=s.charAt(i);
           if(ch=='a'|| ch=='b'|| ch=='c')
           {
               result.append('2');
           }
         else  if(ch=='d'|| ch=='e'|| ch=='f')
           {
               result.append('3');
           }
           else  if(ch=='g'|| ch=='h'|| ch=='i')
           {
               result.append('4');
           }
           else  if(ch=='j'|| ch=='k'|| ch=='l')
           {
               result.append('5');
           }
           else  if(ch=='m'|| ch=='n'|| ch=='o')
           {
               result.append('6');
           }
           else  if(ch=='p'|| ch=='q'|| ch=='r' ||ch=='s')
           {
               result.append('7');
           }
           else  if(ch=='t'|| ch=='u'|| ch=='v')
           {
               result.append('8');
           }
           else if(ch=='w'|| ch=='x'|| ch=='y'|| ch=='z')
           {
               result.append('9');
           }
        }
        return result.toString();
    }
}