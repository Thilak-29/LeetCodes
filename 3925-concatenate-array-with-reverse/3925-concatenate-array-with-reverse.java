class Solution {
    public int[] concatWithReverse(int[] nums) {
        int l = nums.length;
        int n = l*2;
        int[] arr = new int[n];
        int[] rev = new int[l];
        for(int i=l-1;i>=0;i--){
            rev[l - 1 - i] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        for(int i=0;i<rev.length;i++){
            arr[l+i] = rev[i];
        }
        return arr;
    }
}