class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(String c : operations){
            
            
            if(c.equals("C")){
                st.pop();
            }
            else if(c.equals("D")){
                st.push(st.peek()*2);
            }
            else if(c.equals("+")){
                int first = st.pop();
                int second = st.peek();
                st.push(first);
                st.push(first+second);
            }
            else{
                st.push(Integer.parseInt(c));
            }
        }
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}