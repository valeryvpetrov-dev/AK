class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numsToIdx = HashMap<Int, Int>()
        for ((idx, num) in nums.withIndex()) {
            val complement = target - num
            numsToIdx[complement]?.let { return intArrayOf(it, idx) }
            numsToIdx[num] = idx
        }
        return intArrayOf()
    }
}