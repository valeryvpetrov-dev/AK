class Solution {
    fun isHappy(n: Int): Boolean {
        val prevs = HashSet<Int>()
        var curr = n; var next = -1
        while (!prevs.contains(curr)) {
            next = getNext(curr)
            println(next)
            prevs.add(curr)
            curr = next
        }
        return next == 1
    }
    
    fun getNext(n: Int): Int {
        var reamining = n; var digit = 0
        var next = 0
        while (reamining > 0) {
            digit = reamining % 10
            next += digit * digit
            reamining /= 10
        }
        return next
    }
}