class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        char[] arr = s.toCharArray();
        for(int i=0;i<k;i++){
            if(isVowel(arr[i])){
                count++;
            }
        }
        int max = count;
        for(int i=k;i<arr.length;i++){
            if(isVowel(arr[i-k])){
                count--;
            }
            if(isVowel(arr[i])){
                count++;
            }
            max = Math.max(max,count);

        }
        return max;
    }
     public boolean isVowel(char ch) {
        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}