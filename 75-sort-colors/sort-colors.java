class Solution {
    public void sortColors(int[] nums) {
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        int n = nums.length;
        for (int i = 0 ; i < n ; i++){
            if (nums[i] == 0){
                cnt0+=1;
            }
            else if(nums[i] == 1){
                cnt1+=1;
            }
            else{
                cnt2+=1;
            }
        }
        for(int j = 0 ; j < n ; j++){
            if(cnt0 > 0){
                nums[j] = 0;
                cnt0-=1;
            }
            else if(cnt1 > 0){
                nums[j] = 1;
                cnt1-=1;
            }
            else{
                nums[j] = 2;
                cnt2-=1;
            }
        }
    }
}