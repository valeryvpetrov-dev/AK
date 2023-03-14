class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        var dict = [Int: Int]()
        
        for (index, num) in nums.enumerated() {
            let expected = target - num
            if dict[expected] != nil {
                return [index, (dict[expected] ?? 0)]
            }
            dict[num] = index
        }
        return []
    }
}
