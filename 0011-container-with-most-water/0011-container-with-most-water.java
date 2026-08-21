class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int maxw = 0;
        int right = height.length-1;
        while(left<right){
            
            int h = Math.min(height[left],height[right]);
            int w = right-left;
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }

            maxw = Math.max(maxw,h*w);
            
        }
        return maxw;
    }
}