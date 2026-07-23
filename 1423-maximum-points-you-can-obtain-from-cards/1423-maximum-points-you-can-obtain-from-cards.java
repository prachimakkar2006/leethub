class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<k;i++) {
            leftSum+=cardPoints[i];
        }
        int max = leftSum;
        int right = n-1;
        for(int j=k-1;j>=0;j--) {
            leftSum-=cardPoints[j];
            rightSum+=cardPoints[right];
            right--;
            max = Math.max(max,leftSum+rightSum);
        }
        return max;
    }
}