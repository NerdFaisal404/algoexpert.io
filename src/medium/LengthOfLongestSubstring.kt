package medium

fun lengthOfLongestSubstring(s: String): Int {
    var left = 0
    var right = 0
    var max = 0
    val set = HashSet<Char>()

    while (right < s.length) {
        if (!set.contains(s[right])) {
            set.add(s[right])
            right++
            max = Math.max(max, set.size)
        } else {
            set.remove(s[left])
            left++
        }
    }
    return max
}

fun characterReplacement(s: String, k: Int): Int {
    var left = 0
    var right = 0
    var max = 0
    var maxCount = 0
    val map = HashMap<Char, Int>()

    while (right < s.length) {
        val currentChar = s[right]
        map[currentChar] = map.getOrDefault(currentChar, 0) + 1
        maxCount = Math.max(maxCount, map[currentChar]!!)

        while (right - left + 1 - maxCount > k) {
            val leftChar = s[left]
            map[leftChar] = map[leftChar]!! - 1
            left++
        }

        max = Math.max(max, right - left + 1)
        right++
    }
    return max
}