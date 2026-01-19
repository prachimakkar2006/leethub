class Solution {
    public int minSwaps(String s) {
        if(s.length() % 2 != 0) return -1;
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch=='[') {
                st.push(ch);
            }
            else{
                if(!st.isEmpty() && st.peek() == '['){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        int open =0;
        int close = 0;
        while(!st.isEmpty()) {
            if(st.peek()=='[') open++;
            else close++;
            st.pop();
        }
        return (open+1)/2;
    }
}