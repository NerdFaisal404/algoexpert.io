package medium





    fun main(args: Array<String>) {
        println(maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
    }


    fun maxArea(height: IntArray): Int {
        var maxArea = 0
        var left = 0
        var right = height.size - 1

        while (left < right) {
            val currentArea = Math.min(height[left], height[right]) * (right - left)
            maxArea = Math.max(maxArea, currentArea)

            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }

        return maxArea
    }
