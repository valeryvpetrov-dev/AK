class Solution {
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
        return heights.zip(names)
            .sortedByDescending { it.first }
            .map { it.second }
            .toTypedArray()
    }
}