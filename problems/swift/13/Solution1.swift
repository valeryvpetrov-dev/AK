class Solution {
    func romanToInt(_ s: String) -> Int {
        var result = 0
        
        let romanDict = [
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        ]
        
        let array = s.compactMap({ romanDict[String($0)] })
        
        for (index, value) in array.enumerated() {
            guard index + 1 < array.count else {
                result += value
                return result
            }
            
            let nextValue = array[index + 1]
            
            if value < nextValue {
                result -= value
            } else {
                result += value
            }
        }
        return result
    }
}
