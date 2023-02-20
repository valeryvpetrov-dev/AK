class Solution {
    fun isLongPressedName(name: String, typed: String): Boolean {
        var i = 0
        var j = 0
        while (j < typed.length) {
            if (i < name.length && name[i] == typed[j]) {
                i++
            } else if (j == 0 || typed[j] != typed[j - 1]) {
                return false
            }
            j++
        }
        return i == name.length
    }
}