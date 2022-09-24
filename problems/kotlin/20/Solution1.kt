class Solution {
    val openClose: Map<Char, Char> = mapOf(
        '(' to ')',
        '[' to ']',
        '{' to '}'
    )
    
    fun isValid(s: String): Boolean {
        val openStack = Stack<Char>()
        for (c in s) {
            when {
                openClose.containsKey(c) -> openStack.push(c)
                openClose.containsValue(c) -> {
                    if (openStack.isEmpty()) return false
                    val lastOpen = openStack.pop()
                    if (openClose[lastOpen] != c) return false
                }
                else -> return false
            }
        }
        return openStack.isEmpty()
    }
}