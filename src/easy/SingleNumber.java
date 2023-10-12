package easy;


public class SingleNumber {

    public static void main(String[] args) {
        System.out.println("args = " + singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    public static int singleNumber(int[] nums) {
        int singleNum = 0;

        for (int num : nums) {
            singleNum = num ^ singleNum;

        }
        return singleNum;
    }

//    public static int singleNumberUsingSet(int[] nums) {
//        Set<Integer> numberList = new HashSet<>();
//        for (int num :nums){
//            if (numberList.contains(num)){
//                numberList.remove(num);
//            }else {
//                numberList.add(num);
//            }
//        }
//        return  numberList.iterator().next();
//
//    }
}
