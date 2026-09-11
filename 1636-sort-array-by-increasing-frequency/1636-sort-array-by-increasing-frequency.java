class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> li = new ArrayList<>();
        

        for(int x : nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((a, b) -> {
    if (map.get(a) != map.get(b)) {
        return map.get(a) - map.get(b);
    }
    return b - a;
});
        for(int key : keys){
            for(int i=0;i<map.get(key);i++){
                li.add(key);
            }
        }
        int[] ans = new int[li.size()];
        for(int i=0;i<li.size();i++){
            ans[i] = li.get(i);
        }
        return ans;
    }
}