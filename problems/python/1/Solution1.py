class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numsToIdx = dict()
        for i in range(0, len(nums)):
            complement = target - nums[i]
            if complement in numsToIdx:
                return [numsToIdx[complement], i]
            numsToIdx[nums[i]] = i
        return []