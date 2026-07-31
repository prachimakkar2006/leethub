class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String rev="";
        for(String word:words) {
            rev+=new StringBuilder(word).reverse().toString()+" ";
        }
        return rev.trim();
    }
}