package medium

class TwoSumII {

    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left: Int = 0
        var right: Int = numbers.size - 1

        while (left < right) {
            var currentSum = numbers[left] + numbers[right]

            if (currentSum > target) {
                right--
            } else if (currentSum < target) {
                left++
            } else {
                return intArrayOf(left + 1, right + 1)
            }


        }
        return intArrayOf()

    }
}