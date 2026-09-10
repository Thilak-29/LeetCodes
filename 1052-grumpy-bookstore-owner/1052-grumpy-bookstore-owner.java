class Solution {

    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int base = 0;

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                base += customers[i];
            }
        }

        int windowSum = 0;

        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                windowSum += customers[i];
            }
        }

        int maxWindow = windowSum;

        for (int i = minutes; i < customers.length; i++) {

            if (grumpy[i] == 1) {
                windowSum += customers[i];
            }

            if (grumpy[i - minutes] == 1) {
                windowSum -= customers[i - minutes];
            }

            maxWindow = Math.max(maxWindow, windowSum);
        }

        return base + maxWindow;
    }
}