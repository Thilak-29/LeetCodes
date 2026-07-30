class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int top = -1;
       
        for(char str : s.toCharArray()){
            if(!st.isEmpty()&& st.peek()==str){
                st.pop();

            }
            else{
                st.push(str);
            }
            
            
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}