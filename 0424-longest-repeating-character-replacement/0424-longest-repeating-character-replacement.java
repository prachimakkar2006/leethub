class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int freq = 0;
        int max=0;
        int i=0;
        Map<Character,Integer> map = new HashMap<>();
        for(int j=0;j<n;j++) {
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            freq=Math.max(freq,map.get(ch));
            if((j-i+1)-freq>k) {
                char leftChar = s.charAt(i);
                map.put(leftChar,map.getOrDefault(leftChar,0)-1);
                i++;
            }
            max = Math.max(max,j-i+1);
           
        }
        return max;
    }
}