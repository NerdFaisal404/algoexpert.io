package easy

class isPalindromeString {
   fun main(args :Array<String>){




   }

   fun isPalindrome(s: String): Boolean {
      var i : Int = 0
      var j : Int = s.length - 1

        while(i < j){
             while(i < j && !s[i].isLetterOrDigit()) i++
             while(i < j && !s[j].isLetterOrDigit()) j--
             if(s[i].lowercaseChar() != s[j].lowercaseChar()) return false
             i++
             j--
        }

      return true
   }

    fun isPalindromeJava(s: String): Boolean {
        var i = 0
        var j = s.length - 1
        while (i < j) {
            val start = s[i]
            val end = s[j]
            if (!Character.isLetterOrDigit(start)) {
                i++
                continue
            }
            if (!Character.isLetterOrDigit(end)) {
                j--
                continue
            }
            if (start.lowercaseChar() != end.lowercaseChar()) {
                return false
            }
            i++
            j--
        }
        return true
    }



}