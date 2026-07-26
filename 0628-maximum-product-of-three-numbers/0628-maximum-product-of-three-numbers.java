class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a=nums[n-1];
        int b = nums[n-2];
        int c = nums[n-3];
        int one = a*b*c;

        int a1=nums[0];
        int b1 = nums[n-1];
        int c1 = nums[n-2];
        int two = a1*b1*c1;

        int a2=nums[0];
        int b2 = nums[1];
        int c2 = nums[n-1];
        int thr = a2*b2*c2;
        
        int max1 = Math.max(one,two);
        int max2 = Math.max(max1,thr);
        
        return max2;
    }
}