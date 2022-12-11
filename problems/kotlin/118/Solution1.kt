class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        if (numRows == 0) return emptyList()
        
        val res = ArrayList<List<Int>>()
        res.add(listOf(1))
        
        for(i in 1..numRows - 1) {
            val list = ArrayList<Int>()
            list.add(1)
            for (j in 1..i - 1) {
                list.add(res[i - 1][j - 1] + res[i - 1][j])
            }
            list.add(1)
            res.add(list)
        }
         return res
    }
}