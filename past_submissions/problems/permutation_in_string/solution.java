class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s2.length();
        int k = s1.length();
        if (s1.length() > s2.length()) return false;
        char[] arr = s1.toCharArray();
        Arrays.sort(arr);
        String sortedS2 = new String(arr);
        int i=0;
        int j=0;
        String st="";
        while(j<n) {
            st+=s2.charAt(j);
            if(j-i+1<k) j++;
            else if(j-i+1==k) {
                char[] arr2 = st.toCharArray();
                Arrays.sort(arr2);
                String sortedS1 = new String(arr2);
                if(sortedS1.equals(sortedS2)) return true;
                st = st.substring(1);
                i++;
                j++;
            }
        }
        return false;
    }
}