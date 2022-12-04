class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        // Initial
        val m = grid.size; val n = grid.first().size
        var count = 0
        // Payload
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] < 0) count++
            }
        }
        return count
    }
}