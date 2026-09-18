class Solution {
    public int lastStoneWeight(int[] stones) {
        Stack<Integer> stack = new Stack<>();

        for(int x : stones) {
            stack.push(x);
        }

        while(stack.size() > 1) {
            Collections.sort(stack);

            int a = stack.pop();
            int b = stack.pop();

            if(a != b) {
                stack.push(a - b);
            }
        }

        return stack.isEmpty() ? 0 : stack.peek();
    }
}