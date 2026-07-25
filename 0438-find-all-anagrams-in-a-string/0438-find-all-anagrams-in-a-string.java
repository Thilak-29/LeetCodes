class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
        ArrayList<Integer> li = new ArrayList<>();
        char[] ch = p.toCharArray();
        Arrays.sort(ch);
       for (int i = 0; i <= s.length() - p.length(); i++){
           String sub=s.substring(i,i+p.length());
           char[] ch2 = sub.toCharArray();
           Arrays.sort(ch2);
           if(Arrays.equals(ch,ch2)){
            li.add(i);
           }
        }
        return li;
    }
}