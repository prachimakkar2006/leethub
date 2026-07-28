class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n = answerKey.length();
        int i=0;
        int j=0; 
        HashMap<Character,Integer> map = new HashMap<>();
        int max=0;
        int freq=0;
        while(j<n) {
            char ch = answerKey.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            freq=Math.max(freq,map.get(ch));
            if((j-i+1)-freq>k) {
                char left = answerKey.charAt(i);
                map.put(left,map.getOrDefault(left,0)-1);
                i++;
            }
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}