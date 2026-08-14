class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int len =0;
        while(j<n) {
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch) > 2) {
                char leftChar = s.charAt(i);
                map.put(leftChar, map.get(leftChar) - 1);
                i++;
            }
            len = Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}