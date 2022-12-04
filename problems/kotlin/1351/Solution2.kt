class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        // Initial
        val m = grid.size; val n = grid.first().size
        var count = 0
        // Payload
        for (i in m - 1 downTo 0) {
            for (j in n - 1 downTo 0) {
                if (grid[i][j] < 0) count++
            }
        }
        return count
    }
}