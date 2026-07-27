class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int window = nums[0];
        int start = 0;
        int end = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        if(window>=target){
            min=1;
        }
        while(end<nums.length-1){
            
                end++;
                window+=nums[end];
            
            while(window>=target){
                min = Math.min(min,end-start+1);
                window-=nums[start];
                start++;
                
        }
        
    }
    return min == Integer.MAX_VALUE?0:min;
}
}