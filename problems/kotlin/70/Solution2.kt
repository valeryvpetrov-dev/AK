class Solution {
    fun climbStairs(n: Int): Int {
        return when {
            n == 1 -> 1
            n == 2 -> 2
            n == 3 -> 3
            n == 4 -> 5
            n == 5 -> 8
            n == 6 -> 13
            n == 7 -> 21
            n == 8 -> 34
            n == 9 -> 55
            n == 10 -> 89
            n == 11 -> 144
            else -> climbStairs(n - 1) + climbStairs(n - 2)
        }
    }
}