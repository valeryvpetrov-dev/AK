package problems.java.1

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsToIdx = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int comlement = target - nums[i];
            if (numsToIdx.containsKey(comlement)) {
                return new int[] { numsToIdx.get(comlement), i };
            }
            numsToIdx.put(nums[i], i);
        }
        throw new IllegalStateException("Invalid input");
    }
}