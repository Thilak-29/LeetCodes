class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int windlen = Integer.MAX_VALUE;
        int left = 0;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                 windlen = Math.min(windlen, right - left + 1);
                 sum-=nums[left];
                 left++;
            }
            
        }
        return windlen == Integer.MAX_VALUE?0:windlen;
    }
}