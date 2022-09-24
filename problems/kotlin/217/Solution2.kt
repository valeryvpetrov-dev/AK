class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val uniqueNums = HashSet<Int>()
        for (num in nums) {
        	if (uniqueNums.contains(num)) return true
            uniqueNums.add(num)
        }
        return false
    }
}