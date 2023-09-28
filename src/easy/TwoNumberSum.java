package easy;

import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    public static void main(String[] args) {
        int[] array = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int[] result = twoNumberSum(array, 10);
        System.out.println("args = " + result[0] + result[1]);
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> visitedSet = new HashSet<Integer>();

        for (int num : array) {
            if (visitedSet.contains(targetSum - num)) {
                return new int[]{targetSum - num, num};
            }
            visitedSet.add(num);

        }
        return new int[0];
    }
}
