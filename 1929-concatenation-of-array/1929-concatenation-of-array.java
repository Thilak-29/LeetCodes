class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] conarr = new int[len*2];
        System.arraycopy(nums,0,conarr,0,len);
        System.arraycopy(nums,0,conarr,len,len);
        return(conarr);
    }
}