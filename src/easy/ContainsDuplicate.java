package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> duplicateNumber = new HashSet<>();

        for (int num : nums){
            if (duplicateNumber.contains(num)){
                return true;
            }else {
                duplicateNumber.add(num);
            }
        }

        return false;
    }

}
