class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int len =0;
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        while(j<n) {
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch) > 2) {
                char leftch = s.charAt(i);
                map.put(leftch,map.get(leftch)-1);
                i++;
            }
            len = Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}