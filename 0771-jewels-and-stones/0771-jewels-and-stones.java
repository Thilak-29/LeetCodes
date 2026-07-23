class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int j=0;j<jewels.length();j++){
            for(int k=0;k<stones.length();k++){
                if(jewels.charAt(j)==stones.charAt(k)){
                    count++;
                }
            }
    
    }
    return count;
}
}