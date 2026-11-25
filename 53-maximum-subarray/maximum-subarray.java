class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int maxSum = 0;
        for(int i = 0 ; i < n ; i++){
            maxSum += nums[i];
            if(maxSum > maxi){
                maxi = maxSum;
            }
            if(maxSum < 0){
                maxSum = 0;
            }
        }
        return maxi;
    }
}