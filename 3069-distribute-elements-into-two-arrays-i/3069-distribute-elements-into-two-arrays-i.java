import java.util.ArrayList;

class Solution {
    public int[] resultArray(int[] nums) {

        ArrayList<Integer> li = new ArrayList<>();
        ArrayList<Integer> li2 = new ArrayList<>();

        li.add(nums[0]);
        li2.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {

            if (li.get(li.size() - 1) > li2.get(li2.size() - 1)) {
                li.add(nums[i]);
            } else {
                li2.add(nums[i]);
            }
        }

        li.addAll(li2);

        int[] ans = new int[li.size()];

        for (int i = 0; i < li.size(); i++) {
            ans[i] = li.get(i);
        }

        return ans;
    }
}