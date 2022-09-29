class Solution {
    fun isHappy(n: Int): Boolean {
        var slow = n; var fast = getNext(slow)
        while (fast != 1 && slow != fast) {
            slow = getNext(slow)
            fast = getNext(getNext(fast))
        }
        return fast == 1
    }
    
    private fun getNext(n: Int): Int {
        var next = 0
        var remaining = n
        var digit = 0
        while (remaining > 0) {
            digit = remaining % 10
            next += digit * digit
            remaining /= 10
        }
        return next
    }
}