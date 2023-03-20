class Solution {
    func longestCommonPrefix(_ strs: [String]) -> String {
        var result = ""
        var currentIndex = 0
        var firstChecked = false
        
        for str in strs {
            currentIndex = 0
            if !firstChecked && result == "" {
                result = str
                firstChecked = true
                continue
            }
            
            if result.count == 0 {
                continue
            }
            
            if result.count > str.count {
                result.removeSubrange(Range(uncheckedBounds: (result.index(str.endIndex, offsetBy: 0), result.endIndex)))
            }
            
            for (index, resultChar) in result.enumerated() {
                if str.count - 1 < index {
                    continue
                }
                
                let strIndex = str.index(str.startIndex, offsetBy: index)
                if resultChar != str[strIndex] {
                    result.removeSubrange(Range(uncheckedBounds: (result.index(result.startIndex, offsetBy: currentIndex), result.endIndex)))
                    break
                } else {
                    currentIndex += 1
                }
            }
        }
        return result
    }
}
