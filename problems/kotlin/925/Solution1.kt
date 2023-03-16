class Solution {
    fun isLongPressedName(name: String, typed: String): Boolean {
        if (name.length > typed.length) return false
        var nameI = 0; var typedI = 0
        while (typedI < typed.length) {
            if (name.getOrNull(nameI) == typed[typedI]) nameI++
            else if (name.getOrNull(nameI - 1) != typed[typedI]) return false
            typedI++
        }
        return nameI == name.length
    }
}