class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int i=0;
        int j=0;
        int count =0;
        int max =0;
        while(j<n) {
            if(arr[j]=='a'||arr[j]=='e'||arr[j]=='i'||arr[j]=='o'||arr[j]=='u'){
                count++;
            }
            if(j-i+1<k) j++;
            else if(j-i+1==k) {
                max = Math.max(max,count);
                if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                count--;
            }
            i++;
            j++;
            }
        }
        return max;
    }
}