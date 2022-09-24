class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        disappearedNums = set(range(1, len(nums) + 1))
        for num in nums:
        	if num in disappearedNums:
        		disappearedNums.remove(num)
        return disappearedNums