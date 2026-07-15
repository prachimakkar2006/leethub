class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int k = needle.length();
        int i=0;
        int j=0;
        int num =0;
        String st = "";
        while(j<n) {
            st+=haystack.charAt(j);
            if(j-i+1<k) j++;
            else if(j-i+1==k) {
                if(st.equals(needle)) return i;
                st = st.substring(1);
                i++;
                j++;

            }
        }
        return -1;
        
    }
}