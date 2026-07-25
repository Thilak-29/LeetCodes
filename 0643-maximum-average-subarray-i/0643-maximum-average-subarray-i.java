class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start=0;
        int end=k-1;
        double max=0;
        double sum=0;
        
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double avg=sum/k;
        max=avg;
        while(end<nums.length-1){
            sum=sum-nums[start++]+nums[++end];
            avg=sum/k;
            if(avg>max){
                max=avg;
            }
        }
        return max;
    }
}