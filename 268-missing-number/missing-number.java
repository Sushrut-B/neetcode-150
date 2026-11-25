class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum1 = (nums[n-1]*(nums[n-1]+1)) / 2;
        int sum2 = 0;
        for (int i = 0; i < nums.length ; i++){
            sum2 += nums[i];
        }
        int diff = sum1 - sum2;
        if (diff == 0 && nums[0] == 0){
            return nums[n-1]+1;
        }
        else if (diff == 0 && nums[0] != 0){
            return 0;
        }
        else{
            return diff;
        }
    }
}