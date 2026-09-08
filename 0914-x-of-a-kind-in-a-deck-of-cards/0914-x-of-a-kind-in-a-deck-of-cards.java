import java.util.*;

class Solution {

    public boolean hasGroupsSizeX(int[] deck) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : deck) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }

        int gcd = 0;

        for (int key : map.keySet()) {
            gcd = findGCD(gcd, map.get(key));
        }

        return gcd >= 2;
    }

    public int findGCD(int a, int b) {

        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }

        return a;
    }
}