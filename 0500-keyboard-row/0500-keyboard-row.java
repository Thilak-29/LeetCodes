class Solution {
    public String[] findWords(String[] words) {
        char[] row1 = {'q','w','e','r','t','y','u','i','o','p'};
        char[] row2 = {'a','s','d','f','g','h','j','k','l'};
        char[] row3 = {'z','x','c','v','b','n','m'};

        ArrayList<String> li = new ArrayList<>();

        for (String word : words) {
            String lowerWord = word.toLowerCase();

            char[] wrd = lowerWord.toCharArray();

            int row = 0;

            if (contains(row1, wrd[0])) {
                row = 1;
            } else if (contains(row2, wrd[0])) {
                row = 2;
            } else {
                row = 3;
            }

            boolean valid = true;

            for (int i = 1; i < wrd.length; i++) {
                if (row == 1 && !contains(row1, wrd[i])) {
                    valid = false;
                    break;
                }

                if (row == 2 && !contains(row2, wrd[i])) {
                    valid = false;
                    break;
                }

                if (row == 3 && !contains(row3, wrd[i])) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                li.add(word);  // original word
            }
        }

        return li.toArray(new String[0]);
    }

    public boolean contains(char[] row, char ch) {
        for (char c : row) {
            if (c == ch) {
                return true;
            }
        }
        return false;
    }
}