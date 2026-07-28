class NumArray {
    int[] prefix;
    int nums[];
    public NumArray(int[] nums) {
        this.nums=nums;
        prefix=new int[nums.length];
        prefix[0]=0;
        int j=0;
        for(int i=1;i<nums.length;i++){
            
            prefix[i]=prefix[i-1]+nums[i-1];
        }

    }
    
    public int sumRange(int left, int right) {
        return(prefix[right]-prefix[left])+nums[right];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */