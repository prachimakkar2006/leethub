class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.trim().split("\\s+");
        String lastWord = str[str.length - 1];
        
        return lastWord.length();
    }
}
