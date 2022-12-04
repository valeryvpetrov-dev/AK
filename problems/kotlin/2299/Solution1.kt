class Solution {
    
    private val SPECIAL_CHARS = "!@#$%^&*()-+"
    
    fun strongPasswordCheckerII(password: String): Boolean {
        return checkSize(password) &&
            checkLowerCase(password) &&
            checkUpperCase(password) &&
            checkDigits(password) &&
            checkSpecialChars(password) &&
            checkAdjacent(password)
    }
    
    private fun checkSize(password: String): Boolean {
        return password.length >= 8
    }
    
    private fun checkLowerCase(password: String): Boolean {
        return password.any { it.isLowerCase() }
    }
    
    private fun checkUpperCase(password: String): Boolean {
        return password.any { it.isUpperCase() }
    }
    
    private fun checkDigits(password: String): Boolean {
        return password.any { it.isDigit() }
    }
    
    private fun checkSpecialChars(password: String): Boolean {
        return password.any { SPECIAL_CHARS.contains(it) }
    }
    
    private fun checkAdjacent(password: String): Boolean {
        for (i in 0 until password.length - 1) {
            if (password[i] == password[i + 1]) return false
        }
        return true
    }
}