class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        char[] strArray1 = ransomNote.toCharArray();
        for(char c : strArray1){
            if(hm1.containsKey(c)){
                hm1.put(c,hm1.get(c)+1);
            }
            else{
                hm1.put(c,1);
            }
        }
        HashMap<Character,Integer> hm2 = new HashMap<>();
        char[] strArray2 = magazine.toCharArray();
        for(char c2 : strArray2){
            if(hm2.containsKey(c2)){
                hm2.put(c2,hm2.get(c2)+1);
            }
            else{
                hm2.put(c2,1);
            }
        }
         for (char c : hm1.keySet()) {

            if (!hm2.containsKey(c)) {
                return false;
            }

            if (hm1.get(c) > hm2.get(c)) {
                return false;
            }
        }

        return true;
    }
}