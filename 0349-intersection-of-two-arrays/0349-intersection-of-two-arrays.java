class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> li = new ArrayList<>();
        for(int x : nums1){
            set.add(x);
        }
        for(int x : nums2){
            set2.add(x);
        }
        for(int x : set){
            if(set2.contains(x)){
                li.add(x);
            }
        }
        int[] ans = new int[li.size()];
        for(int i=0;i<li.size();i++){
            ans[i] = li.get(i);
        }
        return ans;
    }
}