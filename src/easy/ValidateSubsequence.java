package easy;

import java.util.*;

public class ValidateSubsequence {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence = new ArrayList<>(Arrays.asList(1, 6, -1, 10));
        boolean isValid = isValidSubsequence(array, sequence);
        System.out.println("IsValid = " + isValid);
    }

    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence
    ) {

        int arrayIndex = 0;
        int seqIndex = 0;

        while (arrayIndex < array.size() && seqIndex < sequence.size()) {
            if (array.get(arrayIndex) == sequence.get(seqIndex)) {
                seqIndex++;
            }

            arrayIndex++;

        }


        return seqIndex == sequence.size();
    }
}
