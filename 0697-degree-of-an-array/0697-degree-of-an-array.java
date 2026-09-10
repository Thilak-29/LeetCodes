class Solution {

    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int x = nums[i];

            if (freq.containsKey(x)) {
                freq.put(x, freq.get(x) + 1);
            } else {
                freq.put(x, 1);
            }

            if (!first.containsKey(x)) {
                first.put(x, i);
            }

            last.put(x, i);
        }

        int degree = 0;

        for (int key : freq.keySet()) {
            degree = Math.max(degree, freq.get(key));
        }

        int answer = nums.length;

        for (int key : freq.keySet()) {

            if (freq.get(key) == degree) {

                int length = last.get(key) - first.get(key) + 1;

                answer = Math.min(answer, length);
            }
        }

        return answer;
    }
}