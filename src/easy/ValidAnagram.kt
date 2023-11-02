package easy

fun isAnagram(s: String, t: String): Boolean {

    if (s.length!=t.length)return false

    val leftHashMap = mutableMapOf<Char, Int>()
    val rightHashMap = mutableMapOf<Char, Int>()

    for (i in s.indices){
        leftHashMap[s[i]]= 1+ leftHashMap.getOrDefault(s[i],0)
        rightHashMap[t[i]]= 1+ rightHashMap.getOrDefault(t[i],0)
    }


    return  leftHashMap==rightHashMap

}

fun main(args: Array<String>) {
    println(isAnagram("anagram","nagaram"))
    println(isAnagram("rat","car"))
}