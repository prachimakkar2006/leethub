class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        int count =0;
        for(int i=0;i<n;i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int ans = -1;
        for(int key:map.keySet()) {
            if(key == map.get(key)) {
                ans = Math.max(ans,key);
            }
        }
        return ans;
    }
}