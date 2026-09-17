class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] need=new int[26];

        for(char c:licensePlate.toCharArray()){
            c=Character.toLowerCase(c);
            if(c>='a'&&c<='z'){
                need[c-'a']++;
            }
        }

        String ans="";

        for(String word:words){
            int[] count=new int[26];

            for(char c:word.toCharArray()){
                count[c-'a']++;
            }

            boolean complete=true;

            for(int i=0;i<26;i++){
                if(count[i]<need[i]){
                    complete=false;
                    break;
                }
            }

            if(complete&&(ans.equals("")||word.length()<ans.length())){
                ans=word;
            }
        }

        return ans;
    }
}