class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for(int i=0;i<nums.length;i++){
            int a = 0;
        int b = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]-nums[i]==1){
                    a = nums[i];
                    b = nums[j];
                    break;
                }
            }
        
         if (a != b) {
                int count = 0;

                for (int k = 0; k < nums.length; k++) {
                    if (nums[k] == a || nums[k] == b) {
                        count++;
                    }
                }

                if (count > max) {
                    max = count;
                }
            }
        }

        return max;
    }
}