//package medium
//
///**
// * Example:
// * var li = ListNode(5)
// * var v = li.`val`
// * Definition for singly-linked list.
// * class ListNode(var `val`: Int) {
// *     var next: ListNode? = null
// * }
// */
//class Solution {
//    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
//        val dummy = ListNode(0)
//        var cur = dummy
//
//        var carry = 0
//        var l1Node = l1
//        var l2Node = l2
//        while (l1Node != null || l2Node != null || carry != 0) {
//            val v1 = l1Node?.`val` ?: 0
//            val v2 = l2Node?.`val` ?: 0
//
//            // new digit
//            val sum = v1 + v2 + carry
//            carry = sum / 10
//            val digit = sum % 10
//            cur.next = ListNode(digit)
//
//            // update pointers
//            cur = cur.next
//            l1Node = l1Node?.next
//            l2Node = l2Node?.next
//        }
//
//        return dummy.next
//    }
//}
