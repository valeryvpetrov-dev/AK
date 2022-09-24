class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int num = 1; num <= nums.length; num++) sum += num;
        for (int num : nums) sum -= num;
        return sum;
    }
}