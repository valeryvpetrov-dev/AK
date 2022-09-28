class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val m = matrix.size; val n = matrix.first().size; val p = m * n
        val result = IntArray(p)
        var i = 0; var j = 0; var k = 0
        var dir = 1; var mLine = m - 1; var nLine = n
        while (k < p) {
            // Calculate section size
            val cLine = if (dir % 2 != 0) nLine-- else mLine--
            // Write current section
            for (x in 1..cLine) {
                result[k] = matrix[i][j]; k++
                shift(
                    i, j, 
                    if (x < cLine) dir else ++dir
                ).apply { i = first; j = second }
            }
        }
        return result.toList()
    }
    
    private inline fun shift(i: Int, j: Int, dir: Int): Pair<Int, Int> {
        return when (dir % 4) {
            1 -> i to j + 1
            2 -> i + 1 to j
            3 -> i to j - 1
            0 -> i - 1 to j
            else -> throw ArithmeticException()
        }
    }
}