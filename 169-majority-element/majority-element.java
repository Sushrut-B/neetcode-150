class Solution {
    public int majorityElement(int[] nums) {
        int currEle = Integer.MAX_VALUE;
        int currCnt = 0;
        for (int i = 0; i < nums.length ; i++){
            if (currCnt == 0){
                currEle = nums[i];
                currCnt = 1;
            }
            else if(currEle == nums[i]){
                currCnt += 1 ;
            }
            else {
                currCnt -= 1;
            }
        }

        int cnt2 = 0;
        for (int j = 0 ; j < nums.length ; j++){
            if(nums[j] == currEle){
                cnt2+=1;
            }
        }
        int n = nums.length;
        if (cnt2 > (n/2)){
            return currEle;
        }
        return 0;
    }
}