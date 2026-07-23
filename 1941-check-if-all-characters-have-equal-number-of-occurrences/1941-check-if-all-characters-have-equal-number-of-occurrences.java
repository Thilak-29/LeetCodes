class Solution {
    public boolean areOccurrencesEqual(String s) {

        HashMap<Character,Integer> hm = new HashMap<>();
        char[] strArray = s.toCharArray();
        for(char c : strArray){
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }
        }
        int exp = hm.get(s.charAt(0));
        for(int value : hm.values()){
            if(value!=exp){
                return false;
            }
        }
        return true;
    }
}