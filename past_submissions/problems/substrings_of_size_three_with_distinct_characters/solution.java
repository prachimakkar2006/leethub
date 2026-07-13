class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int count =0;
        for(int i=0;i+2<n;i++) {
            Set<Character> st = new HashSet<>();
            st.add(s.charAt(i));
            st.add(s.charAt(i+1));
            st.add(s.charAt(i+2));
            if(st.size()==3) count++;
        }
        return count;
        
    }
}