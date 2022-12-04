class Solution {
    
    private val SPECIAL_CHARS = "!@#$%^&*()-+"
    
    fun strongPasswordCheckerII(password: String): Boolean {
        if (password.length < 8) return false
        var checkLowerCase = false
        var checkUpperCase = false
        var checkDigits = false
        var checkSpecialChars = false
        for (i in 0 until password.length) {
            if (
                i < password.length - 1 && 
                password[i] == password[i + 1]
            ) return false
            if (!checkLowerCase && password[i].isLowerCase()) 
                checkLowerCase = true
            if (!checkUpperCase && password[i].isUpperCase()) 
                checkUpperCase = true
            if (!checkDigits && password[i].isDigit()) 
                checkDigits = true
            if (!checkSpecialChars && SPECIAL_CHARS.contains(password[i])) 
                checkSpecialChars = true
        }
        return checkLowerCase && 
            checkUpperCase && 
            checkDigits && 
            checkSpecialChars
    }
}