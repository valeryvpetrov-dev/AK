class Solution {
    func sortPeople(_ names: [String], _ heights: [Int]) -> [String] {
        var indexHeightTuples = [(Int, Int)]()
        var result = [String]()
        
        for (index, value) in heights.enumerated() {
            indexHeightTuples.append((index, value))
        }
        
        indexHeightTuples.sort(by: {$0.1 > $1.1})
        
        for (index, value) in indexHeightTuples {
            result.append(names[index])
        }
        return result
    }
}
