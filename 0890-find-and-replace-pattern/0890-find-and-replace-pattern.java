class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> li = new ArrayList<>();
        for(String s:words){
            if(checked(s,pattern)){
                li.add(s);
            }
        }
        return li;
    }
    boolean checked(String s, String p){
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))!=p.indexOf(p.charAt(i))){
                return false;
            }
        }
        return true;
    }
}