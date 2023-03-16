class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var count = 0
        for (i in nums.indices) {
            if (i < nums.size - 1 && nums[i] == nums[i + 1]) continue
            nums[count++] = nums[i]
        }
        return count
    }
}