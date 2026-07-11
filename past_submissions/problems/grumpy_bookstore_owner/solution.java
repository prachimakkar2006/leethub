class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int i =0;
        int j=0;
        int max =0;
        int satisfied =0;
        int extra=0;
        int total=0;
        for(int k=0;k<n;k++) {
            if(grumpy[k] != 1) satisfied += customers[k];
        }
        while(j<n){
            if(grumpy[j]==1) extra += customers[j];
            if(j-i+1 <minutes) j++;
            else if(j-i+1 == minutes) {
                total = extra + satisfied;
                max = Math.max(total,max);
                if(grumpy[i]==1) extra -= customers[i];
                i++;
                j++;
            }
        }
        return max;
    }
}