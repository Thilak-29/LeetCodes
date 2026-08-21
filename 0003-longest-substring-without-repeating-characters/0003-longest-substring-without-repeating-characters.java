class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int maxlen = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int right=0;right<s.length();right++){
            char curr = s.charAt(right);
            while(hs.contains(curr)){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(curr);
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}