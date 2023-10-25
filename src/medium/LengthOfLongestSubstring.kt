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