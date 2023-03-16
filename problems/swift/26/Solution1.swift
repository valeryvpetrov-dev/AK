class Solution {
    func removeDuplicates(_ nums: inout [Int]) -> Int {
            var itemCount = 0
    var prevItem: Int? = -100000
    for (index, item) in nums.enumerated() {
        guard index != nums.count - 1 else {
            nums.removeAll(where: { $0 == -100000 })
            return nums.count
        }
        
        if item == nums[index + 1] || item == -100000 {
            itemCount += 1
            prevItem = item
            if prevItem == nums[index + 1] {
                nums[index + 1] = -100000
            }
        } else {
            let element = nums[index + 1]
            nums[index + 1 - itemCount] = element
            prevItem = item
            if itemCount > 0 {
                nums[index + 1] = -100000
            }
        }
    }
    nums.removeAll(where: { $0 == -100000 })
    return nums.filter { $0 != -100000 }.count
    }
}

