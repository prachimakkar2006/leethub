class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int k = p.length();
        char[] arr = p.toCharArray();
        Arrays.sort(arr);
        String sortedP = new String(arr);
        int i=0;
        int j=0;
        String st ="";
        List<Integer> lt = new ArrayList<>();
        while(j<n) {
            st+=s.charAt(j);
            if(j-i+1<k) j++;
            else if(j-i+1 == k) {
                char[] arr1 = st.toCharArray();
                Arrays.sort(arr1);
                String sortedS = new String(arr1);
                if(sortedS.equals(sortedP)) lt.add(i);
                st = st.substring(1);
                i++;
                j++;
                
            }
        }
        return lt;
    }
}