package medium

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var maxSum = nums[0]
        var currentSum = 0

        for (i in nums) {
            if (currentSum < 0) {
                currentSum = 0
            }
            currentSum += i
            maxSum = Math.max(maxSum, currentSum)
        }
        return maxSum
    }

    fun exist(board: Array<CharArray>, word: String): Boolean {
        for (i in board.indices) {
            for (j in board[0].indices) {
                if (dfs(board, i, j, word, 0)) {
                    return true
                }
            }
        }
        return false
    }

    fun dfs(board: Array<CharArray>, i: Int, j: Int, word: String, index: Int): Boolean {
        if (index == word.length) {
            return true
        }
        if (i < 0 || i >= board.size || j < 0 || j >= board[0].size || board[i][j] != word[index]) {
            return false
        }
        val temp = board[i][j]
        board[i][j] = ' '
        val found = dfs(board, i + 1, j, word, index + 1) ||
                dfs(board, i - 1, j, word, index + 1) ||
                dfs(board, i, j + 1, word, index + 1) ||
                dfs(board, i, j - 1, word, index + 1)
        board[i][j] = temp
        return found
    }

}