class Solution {
    public int missingNumber(int[] nums) throws IllegalArgumentException {
        for (int target = 0; target <= nums.length; target++) {
            boolean isMissing = true;
            for (int i = 0; i < nums.length && isMissing; i++) {
                if (target == nums[i]) isMissing = false;
            }
            if (isMissing) return target;
        }
        throw new IllegalArgumentException("Invalid input");
    }
}