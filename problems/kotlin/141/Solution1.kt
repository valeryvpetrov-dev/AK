/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) return false
        val passed = HashSet<ListNode>()
        var next = head
        while (next != null) {
            if (passed.contains(next)) return true
            passed.add(next)
            next = next.next
        }
        return false
    }
}