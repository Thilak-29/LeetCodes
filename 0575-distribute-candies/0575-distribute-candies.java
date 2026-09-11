class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length/2;
        HashSet<Integer> set = new HashSet<>();
        for(int x : candyType){
            set.add(x);
        }
        return Math.min(n, set.size());
    }
}