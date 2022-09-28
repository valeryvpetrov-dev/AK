data class Ball(
    val x: Int, 
    val y: Int, 
    val prev: Int, // 0 - nothing
    val dir: Int, // 0 - horizontal, 1 - vertical
    var isBlocked: Boolean = false
) {
    
    fun getNext(curr: Int, m: Int, n: Int): Ball {
        val xNew = when {
            curr == -1 && prev == -1 && dir == 0 -> x + 1
            curr == 1 && prev == 1 && dir == 0 -> x + 1
            else -> x
        }
        val yNew = when {
            // start
            curr == 1 && prev == 0 && dir == 1 -> y + 1
            curr == -1 && prev == 0 && dir == 1 -> y - 1
            // other
            curr == -1 && prev == 1 && dir == 0 -> y - 1
            curr == 1 && prev == -1 && dir == 0 -> y + 1
            curr == -1 && prev == -1 && dir == 1 -> y - 1
            curr == 1 && prev == -1 && dir == 1 -> y + 1
            curr == -1 && prev == 1 && dir == 1 -> y - 1
            curr == 1 && prev == 1 && dir == 1 -> y + 1
            else -> y
        }
        val dirNew = when {
            x != xNew -> 1
            y != yNew -> 0
            else -> dir
        }
        val isBlockedNew = (curr == 1 && prev == -1 && dir == 0) ||
            (curr == -1 && prev == 1 && dir == 0) ||
            (yNew < 0 || yNew >= n)
        return Ball(xNew, yNew, curr, dirNew, isBlockedNew)
    }
}

class Solution {
    fun findBall(grid: Array<IntArray>): IntArray {
        val m = grid.size; val n = grid.first().size
        val maxBouns = grid.size * 2
        val balls = mutableListOf<Ball>().apply {
            repeat(n) { add(Ball(0, it, 0, 1)) }
        }
        repeat(maxBouns) {
            for (i in 0 until n) {
                val ball = balls[i]
                if (!ball.isBlocked)
                    balls[i] = ball.getNext(grid[ball.x][ball.y], m, n)
            }  
        }
        return balls.map { if (it.isBlocked) -1 else it.y }.toIntArray()
    }
}