class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }
            else if(c==')'||c==']'||c=='}'){
                if(stack.isEmpty())return false;
                char ref = stack.pop();
                if (c == ')' && ref != '(') return false;
                if (c == ']' && ref != '[') return false;
                if (c == '}' && ref != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}