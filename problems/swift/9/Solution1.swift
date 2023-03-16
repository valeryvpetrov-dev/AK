class Solution {
    func isPalindrome(_ x: Int) -> Bool {
        String(String(x).reversed()) == String(x)
    }
}