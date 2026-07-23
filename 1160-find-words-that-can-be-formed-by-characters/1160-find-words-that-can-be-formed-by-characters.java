class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        int ans=0;
        for(int i = 0; i < chars.length(); i++){
            freq[chars.charAt(i)-'a']++;
        }
       
        for (String word : words) {

            int[] freq2 = new int[26];

            for (int i = 0; i < word.length(); i++) {
                freq2[word.charAt(i) - 'a']++;
            }

            boolean canForm = true;

            for (int i = 0; i < 26; i++) {
                if (freq2[i] > freq[i]) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                ans += word.length();
            }
        }
            return ans;
        }
        
        

    }
