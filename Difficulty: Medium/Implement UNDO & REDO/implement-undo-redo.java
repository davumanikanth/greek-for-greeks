class Solution {
    StringBuilder sb=new StringBuilder();
    Stack<Character> st=new Stack<>();
    public void append(char x) {
        // append x into document
        sb.append(x);
        
    }

    public void undo() {
        // undo last change
        st.push(sb.charAt(sb.length()-1));
        sb.deleteCharAt(sb.length()-1);
    }

    public void redo() {
        // redo changes
        if(!st.isEmpty())
        {
            sb.append(st.pop());
        }
    }

    public String read() {
        // read the document
        return sb.toString();
    }
}
